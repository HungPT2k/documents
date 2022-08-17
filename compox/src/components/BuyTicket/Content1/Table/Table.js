// import React, {Component} from 'react';
//
// class Table extends Component {
//     constructor(props) {
//         super(props);
//         this.state = {
//                     Table1:[
//                         ["CỘNG HÒA","GÒ VẤP","THỦ ĐỨC"],
//                         ["NAM SÀI GÒN","UNG VĂN KHIÊM","BÌNH TÂN"],
//                         ["CANTAVIL","NOWZONE","GOLD VIEW"]
//                     ],
//         };
//     };
//
//
//     changeTable=(id)=>{
//         if(id===1){
//             this.setState({
//                 Table:[
//                     ["Hà Đông" ,"THANH XUÂN","LONG BIÊN"],
//                     ["Minh Khai","Cầu Giấy","Aeone"]
//                 ],
//             })
//         }
//         if(id===2){
//             this.setState({
//                 Table:[
//                     ["HẠ LONG " ,"TUYÊN QUANG","VIỆT TRÌ"],
//                 ],
//             })
//         }
//         if(id===3){
//             this.setState({
//                 Table:[
//                     ["BẮC GIANG" ,"BẮC NINH","HẢI PHÒNG"],
//                     ["HẢI DƯƠNG","NAM ĐỊNH","NINH BÌNH"],
//                     ["THÁI BÌNH","PHỦ LÝ"]
//                 ],
//             })
//         }
//         if(id===4){
//             this.setState({
//                 Table:[
//                     ["HUẾ" ,"ĐỒNG HỚI","VINH"],
//                     ["NGHỆ AN","THANH HÓA"]
//                 ],
//             })
//         }
//         if(id===5){
//             this.setState({
//                 Table:[
//                     ["BẢO LỘC" ,"ĐÀ NẴNG","HỘI AN"],
//                     ["PHÚ YÊN","KHÁNH HÒA","PHAN GIANG"],
//                     ["QUẢNG NAM"]
//                 ],
//             })
//         }
//         if(id===6){
//             this.setState({
//                 Table:[
//                     ["BIÊN HÒA" ,"BÌNH DƯƠNG","DĨ AN"],
//                     ["ĐỒNG NAI","TÂY NINH","VŨNG TÀU"]
//                 ],
//             })
//         }
//         if(id===7){
//             this.setState({
//                 Table:[
//                     ["CÀ MAU" ,"CẦN THƠ CÁI RĂNG","CẦN THƠ NINH KIỀU"],
//                     ["Minh Khai","Cầu Giấy","Aeone"],
//                     ["LONG XUYÊN"]
//                 ],
//             })
//         }
//
//     }
//  buildTable=()=>{
//         const rows = this.state.Table1.map((row,i) => {
//             return <tr key={i}>
//                 <td><button>{row[0]}</button></td><td><button>{row[1]}</button></td><td><button>{row[2]}</button></td>
//             </tr>
//         })
//         return <table border={1}><tbody>{rows}</tbody></table>
//     }
//     render() {
//
//         return (
//             <div>
//                     {this.buildTable()}
//             </div>
//
//         );
//     }
// }
//
// export default Table;