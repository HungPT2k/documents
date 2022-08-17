import React, {Component} from 'react';
import "../Css/curd.css";
import "../Css/calendarAdmin1.css";
import HeadCurd from "../HeadCurd/HeadCurd";
import MenuCurd from "../MenuCurd/MenuCurd";
import axios from "axios";
import {NavLink} from "react-router-dom";
import {connect} from "react-redux";
import PropTypes from "prop-types";
import {getTodos} from "../../../store/actions/todoActions";


class MovieCalendar extends Component {
    constructor(props) {
        super(props)
        this.state = {
            movies: [],
            zoom: [],
            currentPage: 1,
            recordPerPage: 5,
            gsearch: '',
            dates: '',
            starti:"",
            endti: "",
            Idm: '',
            Idp: '',
            movieP: "",
            movieN: "",
        }
        this.handleChange = this.handleChange.bind(this);
        this.handleChange1 = this.handleChange1.bind(this);
        this.onChange1 = this.onChange1.bind(this);
        this.onChange2 = this.onChange2.bind(this);
    }

    componentDidMount() {
        this.getMoviesByPagination(this.state.currentPage);
        this.getZoom();
      this.addNewSchedule();
    }

    getMoviesByPagination(currentPage) {
        currentPage = currentPage - 1;
        axios.get("http://localhost:8080/ap1/v1/movies/?page=" + currentPage + "&size=" + this.state.recordPerPage)
            .then(response => response.data).then((data) => {
            this.setState({
                movies: data.content,
                totalPages: data.totalPages,
                totalElements: data.totalElements,
                currentPage: data.number + 1
            });
        });
    }

    onChange1(event) {
        event.target.value.replace('%3A', ':')
        this.setState({
            starti: event.target.value+':00',
        })
    }
    onChange2(event) {
        event.target.value.replace('%3A', ':')
        this.setState({
            endti: event.target.value+':00',
        })
    }

    getZoom() {
        axios.get("http://localhost:8080/ap1/v1/zoom")
            .then(response => response.data).then((data) => {
            this.setState({
                zoom: data,

            });
        });
    }
     onChange = (e) => this.setState({ [e.target.name]: e.target.value } );
// Add new Schedule
    addNewSchedule = () => {

        axios.get("http://localhost:8080/ap1/v1/schedule/addNew/" + this.state.dates.toString() + "/" + this.state.endti + "/" + this.state.starti +"/"+ this.state.Idm +"/"+this.state.Idp)
            .then(response => response.data).then((data) => {
           alert(data.message);
        });
    };

//Writing All the pagination functions
    //Show Next page
    showNextPage = () => {
        if (this.state.currentPage < Math.ceil(this.state.totalElements / this.state.recordPerPage)) {
            if (!this.state.search) {
                this.getMoviesByPagination(this.state.currentPage + 1);
            } else {
                this.searchMovie(this.state.currentPage + 1)
            }
        }
    };
    //Show Last Page
    showLastPage = () => {
        if (this.state.currentPage < Math.ceil(this.state.totalElements / this.state.recordPerPage)) {
            if (!this.state.search) {
                this.getMoviesByPagination(Math.ceil(this.state.totalElements / this.state.recordPerPage));
            } else {
                this.searchMovie(Math.ceil(this.state.totalElements / this.state.recordPerPage));
            }
        }
    };
    //Show First page
    showFirstPage = () => {
        let firstPage = 1;
        if (this.state.currentPage > firstPage) {
            if (!this.state.search) {
                this.getMoviesByPagination(firstPage);
            } else {
                this.searchMovie(firstPage)
            }
        }
    };
    //Show previous page
    showPrevPage = () => {
        let prevPage = 1
        if (this.state.currentPage > prevPage) {
            if (!this.state.search) {
                this.getMoviesByPagination(this.state.currentPage - prevPage);
            } else {
                this.searchMovie(this.state.currentPage - prevPage);
            }
        }
    };
    //Search Box Method
    searchBox = (e) => {
        this.setState({
            //assigning value to event target
            [e.target.name]: e.target.value,
        });
    };
    //Search Method Logic
    searchMovie = (currentPage) => {
        currentPage = currentPage - 1;
        axios.get("http://localhost:8080/ap1/v1/movies/pages/" + this.state.gsearch + "?page=" + currentPage + "&size=" + this.state.recordPerPage)
            .then(response => response.data).then((data) => {
            this.setState({
                movies: data.content,
                totalPages: data.totalPages,
                totalElements: data.totalElements,
                currentPage: data.number + 1
            });
        });
    };
    //Reset Search Box
    resetMovie = (currentPage) => {
        this.setState({"gsearch": ''});
        this.getMoviesByPagination(this.state.currentPage);
    };

    // get Thông tin phim
    handleChange(idm, p, n) {
        this.setState({Idm: idm, movieP: p, movieN: n});
    }

// get Thông tin phòng
    handleChange1(event) {
        this.setState({Idp: event.target.value});
    }

    showMovies = () => {
        let dataName = [];
        let name = [];

        this.state.movies.map(i => {
            name.push(i)
            if (name.length === 1 || i === (this.state.movies.length - 1)) {
                dataName.push(name);
                name = [];
            }
        })
        const rows = dataName.map((row, i) => {
            return <tr key={i}
                       onClick={this.handleChange.bind(this, row[0].movieId, row[0].moviePoster, row[0].movieName)}>
                <td><img src={row[0].moviePoster}/></td>
                <td>{row[0].movieName}</td>
                <td><a href={row[0].movieTrailer}>Xem Trailer</a></td>
                <td>{row[0].dateRelease}</td>
                <td>{row[0].movieType}</td>
            </tr>

        })
        return <table>
            <tbody>
            <tr>
                <th>Poster</th>
                <th>Name</th>
                <th>Trailer</th>
                <th>Release</th>
                <th>Type</th>
            </tr>
            {rows}
            </tbody>
        </table>;
    }

    render() {
        const {currentPage, totalPages, gsearch, dates,starti, endti,Idm,Idp} = this.state;
        const rows = this.state.zoom.map(e => (
            <option value={e.zoomId}>{e.zoomName}</option>));
        // function getListZoom() {
        //     return <table border={1}><tbody>{rows}</tbody></table>
        // }
        return (
            <div>
                <div>
                    <HeadCurd/>
                    <MenuCurd/>

                    <div className="containerCurd">
                        <div className="CalendarMovie">

                            <div className="gSearch">

                                <label htmlFor="gsearch">Search Movie:</label>
                                <input type="search" id="gsearch" name="gsearch" value={gsearch}
                                       onChange={this.searchBox}/>
                                <input type="submit" defaultValue="Submit" onClick={this.searchMovie}/>

                            </div>
                            <div className="tableCurd">
                                {this.showMovies()}
                            </div>
                            <div className="pageOf">
                                <div style={{float: 'left', fontFamily: 'monospace', color: '#0275d8'}}>
                                    Page {currentPage} of {totalPages}
                                </div>
                            </div>
                            <div className="pagination">
                                <ul>
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
                            <div className="showSchedule1">
                                <hr color="black" size="7px"/>
                                <div className="boxSchedule1">
                                    <div className="potter1">
                                        <img src={this.state.movieP}/>
                                    </div>
                                    <div className="inforShow1">
                                        <ul>
                                            <li>
                                                <h2>{this.state.movieN}</h2>
                                            </li>

                                        </ul>
                                        <form>
                                            <div>
                                                <label htmlFor="da">Ngày công chiếu:</label><br/>
                                                <input type="date" id="da" name="dates" value={dates} onChange={this.onChange}/><br/>
                                            </div>
                                            <div>
                                                <label htmlFor="starti">Start time:</label><br/>
                                                <input className="input1" type="time" min="06:00" max="23:00"
                                                       id="starti" name="starti" value={starti} onChange={this.onChange1} /><br/>

                                                <label htmlFor="pwd">End time:</label><br/>
                                                <input className="input2" type="time" min="06:00" max="23:00" id="pwd"
                                                       name="endti" value={endti} onChange={this.onChange2}/>
                                            </div>
                                            <div>
                                                {/*<label htmlFor="mo">Id phim:</label><br/>*/}
                                                {/*<input type="text" id="mo" name="Idm" value={Idm}/><br/>*/}
                                                {/*<input type="text" id="mo" name="Idp" value={Idp}/><br/>*/}
                                            </div>

                                            <input className="addNew1" value="Tạo" type="submit" onClick={this.addNewSchedule}/>
                                        </form>
                                        <div className="choseCinemas">
                                            <label htmlFor="Idp">Choose ZoomName:</label>
                                            <select id="Idp" name="Idp"
                                                    onChange={this.handleChange1}>
                                                {rows}
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <hr color="black" size="7px"/>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        );
    }
}

// MovieCalendar.propTypes = {
//     zooms: PropTypes.func,
//     getTodos: PropTypes.func,
// }
// const mapStateToProps = state => {
//     return {d: state.myTodos.zooms}
// }

export default (MovieCalendar);