//package com.example.springboot;
//
//import com.example.springboot.models.ResponseObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//    @RequestMapping(path = "/api/v1/products")
//    public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("")
//    // http://localhost:8080/api/v1/Products
//    List<Product> getAllProduct() {
//        return productService.getAllProduct();
//    }
//    // findByID
//    @GetMapping("/{id}")
//    ResponseEntity<ResponseObject> finById(@PathVariable Long id) {
//        return ResponseEntity.status(HttpStatus.OK).body(productService.findProductById(id));
//    }
//    // insert
//    @PostMapping("/insert")
//    ResponseEntity<ResponseObject> InsertProduct(@RequestBody Product newProduct) {
//
//        return  ResponseEntity.status(HttpStatus.OK).body(productService.insertProduct(newProduct));
//    }
//    // update
//    @PutMapping("/{id}")
//    ResponseEntity<ResponseObject> UpdateProduct(@RequestBody Product newProduct,@PathVariable long id) {
//      return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(newProduct,id));
//
//    }
//    // delete
//    @DeleteMapping("/{id}")
//    ResponseEntity<ResponseObject> DeleteProduct(@PathVariable long id) {
//        return ResponseEntity.status(HttpStatus.OK).body(productService.deleteProduct(id));
//}
//}
//
//
