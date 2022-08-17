import React, {Component} from 'react';
import Menu from "../../Menu/Menu";
import Footer from "../../Footer/Footer";
import Header from "../../Header/Header";
import {withParamsAndNavigate} from "../../Auth/Auth";

import "../css/showDetail.css";
class MovieDetail extends Component {
    render() {
        const {location}=this.props;
        return (
            <div>
                <Header></Header>
                <Menu></Menu>
                {/*<div>*/}
                {/*    < a href={location.state.trailer}>  <img src={location.state.poster}/></a>*/}
                {/*</div>*/}
                {/*<ul>*/}
                {/*    <li>{location.state.name}</li>*/}
                {/*    <li>{location.state.type}</li>*/}
                {/*    <li>{location.state.date}</li>*/}
                {/*    <li><a href={location.state.trailer}>xem trailer</a></li>*/}
                {/*</ul>*/}
                {/*<u>*/}
                {/*    <li>{location.state.detail}</li>*/}
                {/*</u>*/}
                <div className="detailMovie">
                    <div className="topDetailMovie">
                        <div className="trailer">
                            <div className="imgTrailer">
                                <img src={location.state.poster} />
                            </div>
                            <div className="buttonXem">
                                <a href={location.state.trailer}><button>Xem Trailer</button></a>
                            </div>
                        </div>
                        <div className="inforMovie">
                            <ul>
                                <li><h1>{location.state.name}</h1></li>
                                <li>Đạo diễn</li>
                                <li>Mỹ</li>
                                <li>{location.state.date}</li>
                                <li>{location.state.type}</li>
                                <li>180p</li>
                            </ul>
                        </div>
                    </div>
                    <div className="bottomDetailMovie">
                        <h1>Nội dung phim</h1>
                        <p>{location.state.detail}</p>
                    </div>
                </div>

                <Footer/>
            </div>
        );
    }
}

export default withParamsAndNavigate(MovieDetail);