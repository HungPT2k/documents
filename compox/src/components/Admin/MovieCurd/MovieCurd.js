import React, {Component} from 'react';
import "../Css/curd.css";
import HeadCurd from "../HeadCurd/HeadCurd";
import MenuCurd from "../MenuCurd/MenuCurd";
import {NavLink} from "react-router-dom";
import axios from "axios";

class MovieCurd extends Component {
    constructor(props){
        super(props)
        this.state ={
            movies:[],
            currentPage:1,
            recordPerPage:5,
            gsearch:'',
        }
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
        axios.get("http://localhost:8080/ap1/v1/movies/pages/"+this.state.gsearch+"?page="+currentPage+"&size="+this.state.recordPerPage)
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
        this.setState({"gsearch":''});
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
            if (name.length === 1 || i === (this.state.movies.length - 1)) {
                dataName.push(name);
                name = [];
            }})
        const rows = dataName.map((row,i) => {
            return <tr key={i}>
                    <td><img src={row[0].moviePoster} /></td>
                    <td>{row[0].movieName}</td>
                    <td>$100</td>
                    <td>{row[0].dateRelease}</td>
                    <td>{row[0].movieType}</td>
                    <td className="action">
                        <NavLink to="/admin/movieCurd/edit"><button style={{background: '#444bff'}}>Edit</button></NavLink>
                        <button style={{background: '#ff4130'}}>delete</button>
                    </td>
                </tr>

        })
        return  <table>
            <tbody>
            <tr>
                <th>Poster</th>
                <th>Name</th>
                <th>Trailer</th>
                <th>Release</th>
                <th>Type</th>
                <th className="action">Action</th>
            </tr>
            {rows}
            </tbody></table>;
    }

    render() {
        const { currentPage, totalPages,gsearch} = this.state;
        return (
            <div>
                <div>
                    <HeadCurd/>
                    <MenuCurd/>
                    <div className="gSearch">

                            <label htmlFor="gsearch">Search Movie:</label>
                            <input type="search" id="gsearch" name="gsearch" value={gsearch}  onChange={this.searchBox}/>
                            <input type="submit" defaultValue="Submit" onClick={this.searchMovie} />

                    </div>
                    <div className="containerCurd">
                        <div className="tableCurd">
                            {this.showMovies()}
                            <NavLink to="/admin/movieCurd/add"><button className="addNew"><h1>AddNew</h1></button></NavLink>
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
                    </div>
                </div>
            </div>
        );
    }
}

export default MovieCurd;