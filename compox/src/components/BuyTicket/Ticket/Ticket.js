// import React, {Component, useState} from 'react';
// import style from "../../Css/base.module.scss"
// import {connect} from "react-redux";
// import {markComplete1} from "../../../store/actions/todoActions";
// const Ticket = ({ d,s,m }) => {
//     const [check,setCheck] = useState(true);
//         return (
//             <div>
//             <div className={style.ticket}>
//                 <img src="https://image.freepik.com/free-psd/popcorn-cinema-mock-up-flat-lay_23-2148460277.jpg"/>
//                 <h2>Kiểm tra vé của bạn</h2>
//                 <form>
//                 <ul>
//                     <li>
//                         <label htmlFor="time">Ghế</label>
//                         { s.map(todo => (
//                         <input type="text" id="time" value={todo.name}/>
//                             ))}
//                     </li>
//                     <li>
//                         <label htmlFor="positions">Phòng</label>
//                         { d.map(todo => (
//                             <input type="text" id="positions" value={todo.zoomName}/>
//                         ))}
//                     </li>
//                     <li>
//                         <label htmlFor="name">Phim</label>
//                         { m.map(todo => (
//                         <input style={{width: '300px'}} type="text" id="name" value={todo.movieName}/>
//                         ))}
//                     </li>
//                     <input type="submit" value="Kiểm tra" onClick={() => setCheck(!check)}/>
//                 </ul>
//                 </form>
//             </div>
//                 <div className={check?style.OkTicket:style.CancelTicket}>
//                     <h2>Xác minh đặt vé</h2>
//                     <form>
//                         <ul>
//                             <li>
//                                 <label htmlFor="time">Ghế</label>
//                                 { s.map(todo => (
//                                     <input type="text" id="time" value={todo.name}/>
//                                 ))}
//                             </li>
//                             <li>
//                                 <label htmlFor="positions">Phòng</label>
//                                 { d.map(todo => (
//                                     <input type="text" id="positions" value={todo.zoomName}/>
//                                 ))}
//                             </li>
//                             <li>
//                                 <label htmlFor="name">Phim</label>
//                                 { m.map(todo => (
//                                     <input style={{width: '300px'}} type="text" id="name" value={todo.movieName}/>
//                                 ))}
//                             </li>
//                             <li>
//                                 <label htmlFor="name">Giá vé</label>
//                                 { m.map(todo => (
//                                     <input style={{width: '300px'}} type="text" id="name" value={todo.name}/>
//                                 ))}
//                             </li>
//                             <li>
//                                 <label htmlFor="name">Trạng thái</label>
//                                 { m.map(todo => (
//                                     <input style={{width: '300px'}} type="text" id="name" value={todo.name}/>
//                                 ))}
//                             </li>
//                             <input type="submit" value="Đặt vé"/>
//                             <input type="button" onClick={() => setCheck(!check)} value="Hủy"/>
//                         </ul>
//                     </form>
//                 </div>
//
//             </div>
//         );
//     }
//
//
// const mapStateToProps = state => {
//     return {d: state.myTodos.datas ,s: state.myTodos.seat,m: state.myTodos.movi}
// }
//
// export default connect(mapStateToProps)(Ticket);
// // export default Ticket;
