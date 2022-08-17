//package com.example.springboot;
//
//import com.example.springboot.models.Product;
//import com.example.springboot.models.ResponseObject;
//import com.example.springboot.repositories.ProductRepository;
//import com.example.springboot.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.springframework.web.servlet.function.ServerResponse.status;
//
//@Service
//public class ProductServiceIml implements ProductService {
//    @Autowired
//    private ProductRepository productRepository;
//    @Override
//    public Product saveProduct(Product newProduct) {
//        return productRepository.save(newProduct);
//    }
//
//    @Override
//    public List<Product> getAllProduct() {
//        return productRepository.findAll();
//    }
//
//    @Override
//    public ResponseObject findProductById(Long id) {
//        Optional<Product> foundProduct = productRepository.findById(id);// Optional : có thể null
//        if (foundProduct.isPresent()) { // check null
//            return new ResponseObject("ok", "Query product successfully", foundProduct);
//        } else {
//            return new ResponseObject("eros", "not found id= " + id, "");
//
//        }
//    }
//
//    @Override
//    public ResponseObject findByProductName2(String productName) {
//        List<Product> foundProduct=productRepository.findByProductName(productName);
//        if(foundProduct.size()==0){
//            return new ResponseObject("Fail", "Name Product is not already","");
//        }
//        else {
//            return     new ResponseObject("ok", "Find product successfully", foundProduct);
//        }
//
//    }
//
//    @Override
//    public ResponseObject insertProduct(Product newProduct) {
//                List<Product> foundProduct=productRepository.findByProductName(newProduct.getProductName());
//                if(foundProduct.size()>0){
//                    return new ResponseObject("Fail", "Name Product is already","");
//                }
//                else {
//                    return     new ResponseObject("ok", "Insert product successfully", productRepository.save(newProduct));
//                }
//
//    }
//
//    @Override
//    public ResponseObject updateProduct(Product newProduct, Long id) {
//        Product updateProduct= productRepository.findById(id).map(product -> {
//            product.setProductName(newProduct.getProductName());
//            product.setPrice(newProduct.getPrice());
//            product.setYear(newProduct.getYear());
//            product.setUrl(newProduct.getUrl());
//            return productRepository.save(product);
//        }).orElseGet(()->{
//            newProduct.setId(id);
//            return productRepository.save(newProduct);}
//        );
//
//
//        return new ResponseObject("Ok", "Update Product is successfully",updateProduct);
//
//    }
//
//    @Override
//    public ResponseObject deleteProduct(Long id) {
//        boolean product = productRepository.existsById(id);
//        if(product){
//            productRepository.deleteById(id);
//            return new ResponseObject("ok", "Product is  deleted", "");
//        }
//        return new ResponseObject("Fail", "Product is  not already", "");
//    }
//
//
//}
