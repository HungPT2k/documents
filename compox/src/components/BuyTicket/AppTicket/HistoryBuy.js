import React, {Component} from 'react';
import Header from "../../Header/Header";
import Menu from "../../Menu/Menu";
import Menu2 from "../Menu2/Menu2";
import Footer from "../../Footer/Footer";
import   "../../Css/historyBooking.css";
import axios from "axios";
import {connect} from "react-redux";
class HistoryBuy extends Component {
    constructor() {
        super();
        this.state={
            listBooking:[],
            idUser:"2",
        }

    }
    componentDidMount() {
       // this.getListHistoryBooking();
    }
handleChange=(arr)=>{
        this.setState({idUser:arr})
}

    // getListHistoryBooking=()=> {
    //
    //     axios.get("http://localhost:8080/ap1/v1/booking/historyBooking/" + this.state.idUser)
    //         .then(response => response.data).then((data) => {
    //         this.setState({
    //             listBooking:data
    //         });
    //     });
    //
    // }

    render() {
        const arr=String(this.props.u.map(e => (
            (e.userId))));
     const   getListHistoryBooking=()=> {
         this.props.u.map(e => (
            axios.get("http://localhost:8080/ap1/v1/booking/historyBooking/" + e.userId)
                .then(response => response.data).then((data) => {
                this.setState({
                    listBooking:data
                });
            })
     ));
        }
getListHistoryBooking();
        const rows =this.state.listBooking.map(e=>(
<div>
        <div className="boxSchedule5">
            <div className="potter5">
                <img src={e.moviePoster} />
            </div>
            <div className="inforShow5">
                <ul>
                    <li>
                        <h2>{e.movieName}</h2>

                    </li>
                    <li>
                        <button className="zoom">{e.zoomName}</button>
                        <button className="seat">{e.numberSeat}</button>
                    </li>
                    <li>
                        <label htmlFor="st">Ngày công chiếu</label><br />
                        <input type="date" id="st" value={e.dateShow} /><br />
                    </li>
                    <li>
                        <label htmlFor="st">Giá vé</label><br />
                        <input type="text" id="st" value={e.price} /><br />
                    </li>
                </ul>
                <ul className="time">
                    <li>
                        <label htmlFor="st">Thời gian bắt đầu:</label><br />
                        <input type="text" id="st" value={e.scheduleStart} /><br />
                    </li>
                    <li>
                        <label htmlFor="ed">Thời gian kết thúc:</label><br />
                        <input type="text" id="ed"  value={e.scheduleEnd}/><br />
                    </li>
                </ul>
            </div>

        </div>
    <hr color="black" size="6px" /><br/>
</div>

    )
)
        return (
            <div>
                <Header></Header>
                <Menu></Menu>
                <Menu2></Menu2>
                <div className="showSchedule5">
                    <div className="choseDate5">
                        <h1>h</h1>
                    </div>
                {rows}
                </div>
                <Footer/>
            </div>
        );
    }
}
const mapStateToProps = state => {
    return {u: state.myTodos.movi}}
export default connect(mapStateToProps)(HistoryBuy);