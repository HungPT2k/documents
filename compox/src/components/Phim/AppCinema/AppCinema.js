//
// import Header from "../../Header/Header";
// import Menu from "../../Menu/Menu";
// import Footer from "../../Footer/Footer";
//
// import "../css/style.css";
//
// import PageNumber from "../PageNumber/PageNumber";
// import {connect} from "react-redux";
// import {useEffect} from "react";
// import PropTypes from "prop-types";
// import {getTodos} from "../../../store/actions/todoActions";
//
// import React, {Component} from 'react';
//
//
// class AppCinema extends Component {
//
//       componentDidMount() {
//           const {getTodos} = this.props;
//           getTodos()
//       }
//
//      showMovies=()=> {
//         let dataName=[];
//         let name=[];
//
//  this.props.m.map(i =>{
//             name.push(i)
//             if (name.length === 1 || i === (this.props.m.length - 1)) {
//                 dataName.push(name);
//                 name = [];
//             }})
//         const rows = dataName.map((row,i) => {
//             return   <div key={i} className="box">
//                 <div className="movie">
//                     <div className="movie-image">
//                         <img src={row[0].moviePoster} alt="Avatar"/>
//                         <div className="middle">
//                             <div className="textName">{row[0].movieName}</div>
//                         </div>
//                     </div>
//                 </div>
//
//             </div>
//         })
//         return <div>{rows}</div>;
//     }
//
//     render() {
//         return (
//             <div>
//                         <div>
//
//                              <Header></Header>
//                             <Menu></Menu>
//
//                             <div id="sub-navigation">
//                                 <ul>
//                                      <li><a href="#">SHOW ALL</a></li>
//                               <li><a href="#">LATEST TRAILERS</a></li>
//                                <li><a href="#">TOP RATED</a></li>
//                                     <li><a href="#">MOST COMMENTED</a></li>
//                             </ul>
//                                <div id="search">
//                                  <form action="#" method="get" acceptCharset="utf-8">
//                                        <label htmlFor="search-field">SEARCH</label>
//                                         <input type="text" name="search field" defaultValue="Enter search here" id="search-field" className="blink search-field" />
//                                         <input type="submit" defaultValue="GO!" className="search-button" />
//                                    </form>
//                                </div>
//                             </div>
//                              <div id="content" >
//                                 {this.showMovies()}
//
//                             </div>
//                             <PageNumber/>
//                             <Footer/>
//                        </div>
//             </div>
//         );
//     }
// }
//
//
//
//
// // const AppCinema = ({ m , getTodos}) => {
// //     useEffect(() => {
// //       getTodos()
// //     }, [])
// //     const showMovies=()=> {
// //         let dataName=[];
// //         let name=[];
// //         // eslint-disable-next-line array-callback-return
// //         m.map(i => {
// //             name.push(i)
// //             if (name.length === 1 || i === (m.length - 1)) {
// //                 dataName.push(name);
// //                 name = [];
// //             }})
// //         const rows = dataName.map((row,i) => {
// //             return   <div key={i} className="box">
// //                 <div className="movie">
// //                     <div className="movie-image">
// //                         <img src={row[0].moviePoster} alt="Avatar"/>
// //                         <div className="middle">
// //                             <div className="textName">{row[0].movieName}</div>
// //                         </div>
// //                     </div>
// //                 </div>
// //
// //             </div>
// //         })
// //         return <div>{rows}</div>;
// //     }
// //
// //     return (
// //         <div>
// //
// //             <Header></Header>
// //             <Menu></Menu>
// //
// //             <div id="sub-navigation">
// //                 <ul>
// //                     <li><a href="#">SHOW ALL</a></li>
// //                     <li><a href="#">LATEST TRAILERS</a></li>
// //                     <li><a href="#">TOP RATED</a></li>
// //                     <li><a href="#">MOST COMMENTED</a></li>
// //                 </ul>
// //                 <div id="search">
// //                     <form action="#" method="get" acceptCharset="utf-8">
// //                         <label htmlFor="search-field">SEARCH</label>
// //                         <input type="text" name="search field" defaultValue="Enter search here" id="search-field" className="blink search-field" />
// //                         <input type="submit" defaultValue="GO!" className="search-button" />
// //                     </form>
// //                 </div>
// //             </div>
// //             <div id="content" >
// //                 {showMovies()}
// //
// //             </div>
// //             <PageNumber/>
// //             <Footer/>
// //         </div>
// //
// //
// //     );
// // }
// AppCinema.prototypes={
//     getTodos: PropTypes.func,
// }
// const mapStateToProps = state =>(
//      {m: state.myTodos.listCinemas}
// )
// export default  connect(mapStateToProps,{getTodos})(AppCinema);