
import Header from "../../Header/Header";
import Menu from "../../Menu/Menu";
import Footer from "../../Footer/Footer";

import "../css/style.css";


import {connect} from "react-redux";
import PropTypes from "prop-types";
import {getTodos} from "../../../store/actions/todoActions";

import React, {Component} from 'react';
import axios from "axios";
import {withParamsAndNavigate} from "../../Auth/Auth";


class AppCinema extends Component {

    constructor(props){
        super(props)
        this.state ={
          movies:[],
            currentPage:1,
            recordPerPage:5,
            search:'',
        }
        this.handleChange=this.handleChange.bind(this);
    }
    componentDidMount(){
        this.getMoviesByPagination(this.state.currentPage);
    }
    getMoviesByPagination(currentPage){
        currentPage=currentPage-1;
        axios.get("http://localhost:8080/ap1/v1/movies/?page="+currentPage+"&size="+this.state.recordPerPage)
            .then(response => response.data).then((data) =>{
            this.setState({movies:data.content,
                totalPages:data.totalPages,
                totalElements: data.totalElements,
                currentPage: data.number+1
            });
        });
    }
//Writing All the pagination functions
    //Show Next page
    showNextPage = () =>{
        if(this.state.currentPage < Math.ceil(this.state.totalElements/this.state.recordPerPage)){
            if(!this.state.search){
                this.getMoviesByPagination(this.state.currentPage + 1);
            }else{
                this.searchMovie(this.state.currentPage + 1)
            }
        }
    };
    //Show Last Page
    showLastPage = () =>{
        if(this.state.currentPage < Math.ceil(this.state.totalElements/this.state.recordPerPage)){
            if(!this.state.search){
                this.getMoviesByPagination(Math.ceil(this.state.totalElements/this.state.recordPerPage));
            }
            else{
                this.searchMovie(Math.ceil(this.state.totalElements/this.state.recordPerPage));
            }
        }
    };
    //Show First page
    showFirstPage = ()=>{
        let firstPage = 1;
        if(this.state.currentPage > firstPage){
            if(!this.state.search){
                this.getMoviesByPagination(firstPage);
            }else{
                this.searchMovie(firstPage)
            }
        }
    };
    //Show previous page
    showPrevPage = () =>{
        let prevPage = 1
        if(this.state.currentPage > prevPage){
            if(!this.state.search){
                this.getMoviesByPagination(this.state.currentPage - prevPage);
            }else{
                this.searchMovie(this.state.currentPage - prevPage);
            }
        }
    };
    //Search Box Method
    searchBox = (e) => {
        this.setState({
            //assigning value to event target
            [e.target.name]:e.target.value,
        });
    };
    //Search Method Logic
    searchMovie=(currentPage)=> {
        currentPage=currentPage-1;
        axios.get("http://localhost:8080/ap1/v1/movies/pages/"+this.state.search+"?page="+currentPage+"&size="+this.state.recordPerPage)
            .then(response => response.data).then((data) =>{
            this.setState({movies:data.content,
                totalPages:data.totalPages,
                totalElements: data.totalElements,
                currentPage: data.number+1
            });
        });
    };
    //Reset Search Box
    resetMovie = (currentPage)=>{
        this.setState({"search":''});
        this.getMoviesByPagination(this.state.currentPage);
    };
    //      componentDidMount() {
 //          const {getTodos} = this.props;
 //          getTodos()
 //      }
 //
     showMovies=()=> {
        let dataName=[];
        let name=[];

 this.state.movies.map(i =>{
            name.push(i)
            if (name.length === 1 || i === (name.length - 1)) {
                dataName.push(name);
                name = [];
            }})
        const rows = dataName.map((row,i) => {
            return   <div key={i} className="box">
                <div className="movie">
                    <div className="movie-image">
                        <img src={row[0].moviePoster} alt="Avatar" onClick={this.handleChange.bind(this,row[0].moviePoster,row[0].movieName,row[0].movieType,row[0].dateRelease,row[0].movieTrailer,row[0].movieDetail)}/>
                        <div className="middle">
                            <div className="textName">{row[0].movieName}</div>
                        </div>
                    </div>
                </div>

            </div>
        })
        return <div>{rows}</div>;
    }
handleChange=(p,n,ty,d,tr,de)=>{
         this.props.navigate("/movidetail",{state:{poster:p,name:n,type:ty,date:d,trailer:tr,detail:de}});
}
    render() {
        const { currentPage, totalPages,search} = this.state;
        return (
            <div>
                        <div>

                             <Header></Header>
                            <Menu></Menu>

                            <div id="sub-navigation">
                                <ul>
                                     <li><a href="#">SHOW ALL</a></li>
                              <li><a href="#">LATEST TRAILERS</a></li>
                               <li><a href="#">TOP RATED</a></li>
                                    <li><a href="#">MOST COMMENTED</a></li>
                            </ul>
                               <div id="search">

                                       <label htmlFor="search-field">SEARCH</label>
                                        <input type="text" name="search" defaultValue="Enter search here" id="search-field" className="blink search-field" value={search}  onChange={this.searchBox} />
                                        <input type="submit" defaultValue="GO!" className="search-button" onClick={this.searchMovie} />

                               </div>
                            </div>
                             <div id="content" >
                                {this.showMovies()}

                            </div>
                           <div className="pageOf">
                                <div style={{float: 'left', fontFamily: 'monospace', color: '#0275d8'}}>
                                    Page {currentPage} of {totalPages}
                                </div>
                           </div>
                                    <div className="pagination">
                                        <ul >
                                            <li className="page-item"><a type="button" className="page-link"
                                                                         disabled={currentPage === 1 ? true : false}
                                                                         onClick={this.showPrevPage}>Previous</a></li>
                                            <li className="page-item"><a type="button" className="page-link"
                                                                         disabled={currentPage === 1 ? true : false}
                                                                         onClick={this.showFirstPage}>First</a></li>
                                            <li className="page-item"><a type="button" className="page-link"
                                                                         disabled={currentPage === totalPages ? true : false}
                                                                         onClick={this.showNextPage}>Next</a></li>
                                            <li className="page-item"><a type="button" className="page-link"
                                                                         disabled={currentPage === totalPages ? true : false}
                                                                         onClick={this.showLastPage}>Last</a></li>
                                        </ul>
                                        </div>
                            <Footer/>
                       </div>
            </div>
        );
    }
}

// const mapStateToProps = state =>(
//      {m: state.myTodos.listCinemas}
// )
export default  withParamsAndNavigate(AppCinema);