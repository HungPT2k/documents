//
// import Header from "../../Header/Header";
// import Menu from "../../Menu/Menu";
// import Footer from "../../Footer/Footer";
//
// import "../css/style.css";
//
// import PageNumber from "../PageNumber/PageNumber";
// import {connect} from "react-redux";
//
// const ShowMovies = ({ m }) => {
//     const showMovies=()=> {
//
//         let dataName=[];
//         let name=[];
//         m.map(i => {
//             name.push(i)
//             if (name.length === 5 || i === (m.length - 1)) {
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
//                 <div className="movie">
//                     <div className="movie-image">
//                         <img src={row[1].moviePoster} alt="Avatar"/>
//                         <div className="middle">
//                             <div className="textName">{row[1].movieName}</div>
//                         </div>
//                     </div>
//                 </div>
//                 {/*<div className="movie">*/}
//                 {/*    <div className="movie-image">*/}
//                 {/*        <img src={row[2].moviePoster} alt="Avatar"/>*/}
//                 {/*        <div className="middle">*/}
//                 {/*            <div className="textName">{row[2].movieName}</div>*/}
//                 {/*        </div>*/}
//                 {/*    </div>*/}
//                 {/*</div>*/}
//                 {/*<div className="movie">*/}
//                 {/*    <div className="movie-image">*/}
//                 {/*        <img src={row[3].moviePoster} alt="Avatar"/>*/}
//                 {/*        <div className="middle">*/}
//                 {/*            <div className="textName">{row[3].movieName}</div>*/}
//                 {/*        </div>*/}
//                 {/*    </div>*/}
//                 {/*</div>*/}
//                 {/*<div className="movie">*/}
//                 {/*    <div className="movie-image">*/}
//                 {/*        <img src={row[4].moviePoster} alt="Avatar"/>*/}
//                 {/*        <div className="middle">*/}
//                 {/*            <div className="textName">{row[4].movieName}</div>*/}
//                 {/*        </div>*/}
//                 {/*    </div>*/}
//                 {/*</div>*/}
//             </div>
//         })
//         return <div>{rows}</div>;
//     }
//
//     return (
//         <div>
//
//             <Header></Header>
//             <Menu></Menu>
//
//             <div id="sub-navigation">
//                 <ul>
//                     <li><a href="#">SHOW ALL</a></li>
//                     <li><a href="#">LATEST TRAILERS</a></li>
//                     <li><a href="#">TOP RATED</a></li>
//                     <li><a href="#">MOST COMMENTED</a></li>
//                 </ul>
//                 <div id="search">
//                     <form action="#" method="get" acceptCharset="utf-8">
//                         <label htmlFor="search-field">SEARCH</label>
//                         <input type="text" name="search field" defaultValue="Enter search here" id="search-field" className="blink search-field" />
//                         <input type="submit" defaultValue="GO!" className="search-button" />
//                     </form>
//                 </div>
//             </div>
//             <div id="content" >
//                 {showMovies()}
//
//             </div>
//             <PageNumber/>
//             <Footer/>
//         </div>
//
//
//     );
// }
// const mapStateToProps = state => {
//     return {m: state.myTodos.listCinemas}
// }
// export default  connect(mapStateToProps)(ShowMovies);