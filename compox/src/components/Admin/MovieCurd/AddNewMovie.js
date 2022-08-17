import React, {Component} from 'react';
import HeadCurd from "../HeadCurd/HeadCurd";
import MenuCurd from "../MenuCurd/MenuCurd";
import axios from "axios";
import "../Css/addnew.css";
class AddNewMovie extends Component {
    constructor(props){
        super(props);
    this.state ={
        movieName: '',
        movieTrailer: '',
        moviePoster: '',
        movieType: '',
        movieDetail: '',
        dateRelease: '',
    }

    this.saveMovie = this.saveMovie.bind(this);


}

saveMovie = (e) => {
    e.preventDefault();
    let movie1 = {movieName: this.state.movieName, movieTrailer: this.state.movieTrailer, moviePoster: this.state.moviePoster, movieType: this.state.movieType, movieDetail: this.state.movieDetail, dateRelease: this.state.dateRelease};
     axios.post("http://localhost:8080/ap1/v1/movies/insert",movie1).then(res => {
            console.log(JSON.stringify(res.data));
            alert(res.data.message);
        });
}
//
onChange = (e) =>
    this.setState({ [e.target.name]: e.target.value });
    render() {
        const { movieName, movieTrailer,moviePoster,movieType,movieDetail,dateRelease} = this.state;
        return (
            <div>

                    <HeadCurd/>
                    <MenuCurd/>
                <div className="createMovie">
                <h2 className="text-center">Add New Movie</h2>
                <form onSubmit={this.saveMovie} >
                    <div >
                        <label> Name:</label>
                        <input  placeholder="movieName" name="movieName" type="text" value={movieName} onChange={this.onChange}/>
                    </div>

                    <div>
                        <label>Trailer:</label>
                        <input  placeholder="movieTrailer" name="movieTrailer" type="text" value={movieTrailer} onChange={this.onChange}/>
                    </div>

                    <div >
                        <label>Poster:</label>

                        <input  placeholder="moviePoster" name="moviePoster" type="text" value={moviePoster} onChange={this.onChange}/>
                    </div>

                    <div >
                        <label>Type  :</label>
                        <input  placeholder="movieType" name="movieType" type="text"  value={movieType} onChange={this.onChange}/>
                    </div>
                    <div >
                        <label>Detail:</label>
                        <input  placeholder="movieDetail" name="movieDetail" type="text" value={movieDetail} onChange={this.onChange}/>
                    </div>

                    <div >
                        <label>DateRelease:</label>
                        <input  placeholder="dateRelease" name="dateRelease" type="text"  value={dateRelease} onChange={this.onChange}/>
                    </div>

                    <button type="submit" >Save</button>
                </form>
                </div>
            </div>
        );
    }
}
// AddNewMovie.propTypes = {
//     addTodo: PropTypes.func.isRequired
// }
//
// const mapStateToProps = state => ({})

export default AddNewMovie;
