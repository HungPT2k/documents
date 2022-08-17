// import React, {Component, useEffect} from 'react';
// import {connect} from "react-redux";
// import style from "../components/Css/base.module.scss";
// import PropTypes from "prop-types";
// import {getTodos, markComplete} from "../store/actions/todoActions";
// const PositionList = ({ datapo,getTodos, markComplete }) => {
//     useEffect(() => {
//         getTodos()
//     }, [])
//         return (
//             <div  className={style.position}>
//                 <ul>
//                     { datapo.map(todo => (
//                     <li onClick={markComplete.bind(this,todo.zoomName)} ><a>{todo.zoomName}</a> </li>
//                     ))};
//             </ul>
//             </div>
//
//         );
//     }
// PositionList.propTypes = {
//     markComplete: PropTypes.func,
//     getTodos: PropTypes.func.isRequired,
// }
// const mapStateToProps = state => {
//   return { datapo: state.myTodos.todos } // dùng chung lúc lọc thì todos luôn thay đổi theo ?
// }
// export default connect(mapStateToProps,{getTodos, markComplete})(PositionList);