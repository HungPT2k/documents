import React, {Component} from 'react';
import Header from "../../Header/Header";
import Menu from "../../Menu/Menu";
import Menu2 from "../Menu2/Menu2";
import Footer from "../../Footer/Footer";
import   "../../Css/calendar.css";
import axios from "axios";
import Ticket from "../Ticket/Ticket";
import {connect} from "react-redux";
import { markComplete2} from "../../../store/actions/todoActions";
import PropTypes from "prop-types";
import style from "../../Css/base.module.scss";
import {withParamsAndNavigate} from "../../Auth/Auth";
class ShowCalendarMovie extends Component {
    constructor() {
        super();
        this.state={
         datas:[],
            listSeat:[],
            date:"",
            nameZoom:"",
            seatNumber:0,
            nameMovie1:"",
            check:false,
            check2:true,
            addBooking:[],
            price:"120",
            status:"1",
            seatId:"",
            scheduleId:"",
            idUser:"2",
        }
        this.handleChange = this.handleChange.bind(this);
        this.handleChange1 = this.handleChange1.bind(this);
        this.handleChange7 = this.handleChange7.bind(this);

    }

    componentDidMount() {
        this.getScheduleByDate();
        this.getSeatByZoom();
      //  this.addBooking();

    }
    onChange = (e) => this.setState({ [e.target.name]: e.target.value } );
    handleChange = (nameZ,nameM,sc)=>{
        this.setState({nameZoom:nameZ,nameMovie1:nameM,seatNumber:0,scheduleId:sc}
        )
    //    event.preventDefault();
    }
    handleChange1 = (es,seId )=>{
        this.setState({seatNumber:es,seatId:seId})
    }
    // handleChange2 = (es )=>{
    //     this.setState({nameMovie1:es})
    // }
    handleChange3 = (e )=>{
        this.setState({check:!e})
    }
    getScheduleByDate=()=> {

        axios.get("http://localhost:8080/ap1/v1/schedule/show/" + this.state.date.toString())
            .then(response => response.data).then((data) => {
            this.setState({
                datas:data
            });
        });

    }
    getSeatByZoom=()=> {

        axios.get("http://localhost:8080/ap1/v1/schedule/seatOfZoom/" + this.state.nameZoom)
            .then(response => response.data).then((data) => {
            this.setState({
                listSeat:data
            });
        });

    }
    handleChange7=(arr)=>{
        this.setState({idUser:arr})
    }

    render() {
      const{date,check} = this.state;
        const arr=String(this.props.u.map(e => (
            (e.userId))));

        //this.handleChange7.bind(this,arr);
      //  this.setState({idUser:arr})
       // alert(this.state.idUser);
        const  addBooking=(event)=> {
            event.preventDefault();
            this.props.u.map(e => (
            axios.get("http://localhost:8080/ap1/v1/booking/insert/" + this.state.price+'/'+this.state.status+'/'+this.state.scheduleId+'/'+this.state.seatId+'/'+e.userId.toString())
                .then(response => response.data).then((datas) => {
                console.log(JSON.stringify(datas));
                alert(datas.message);
            })
        ));
        }

        const rows = this.state.datas.map(e => (
    <div>
        <div className="boxSchedule">
            <div className="potter" >
                <img src={e.moviePoster} />
            </div>
            <div className="inforShow" onClick={this.handleChange.bind(this,e.zoomName,e.movieName,e.scheduleId)}>
                <ul>
                    <li>
                        <h2>{e.movieName}</h2>
                    </li>
                    <li>
                        <button >{e.zoomName}</button>
                        <input type="submit" value="Đặt ghế" onClick={this.getSeatByZoom}/>
                    </li>
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
        <hr color="black" size="20px" />
        </div>
    ))
        const rows1 = this.state.listSeat.map(e => (

                <button onClick={this.handleChange1.bind(this,e.numberSeat,e.seatId) }>{e.numberSeat}</button>
          ))
        return (
            <div>
                <Header></Header>
                <Menu></Menu>
                <Menu2></Menu2>
                <div className="booking">
                <div>
                    <div className="showSchedule">
                        <div className="choseDate">

                            <label htmlFor="pwd">Chọn ngày:</label><br />
                            <input type="date" id="pwd" name="date"  value={date} onChange={this.onChange} /><br />
                                <input type="submit" onClick={this.getScheduleByDate}  value="Xem"/><br />

                        </div>
                        {rows}

                    </div>
                </div>
                <div className="choseSeat">

                    <div>
                        <div className="btn-group">
                            {rows1}

                        </div>
                    </div>
                    <div className="imgSeat">
                        <h2>Please chose Seat</h2>
                        <img src="https://st.quantrimang.com/photos/image/2017/08/01/rap-chieu-phim-3.jpg"/>
                    </div>
                </div>
                </div>
                <div className={style.ticket}>
                    <img src="https://image.freepik.com/free-psd/popcorn-cinema-mock-up-flat-lay_23-2148460277.jpg"/>
                    <h2>Kiểm tra vé của bạn</h2>
                    <form>
                        <ul>
                            <li>
                                <label htmlFor="time">Ghế</label>

                                    <input type="text" id="time" value={this.state.seatNumber}/>
                            </li>
                            <li>
                                <label htmlFor="positions">Phòng</label>

                                    <input type="text" id="positions" value={this.state.nameZoom}/>
                            </li>
                            <li>
                                <label htmlFor="name">Phim</label>

                                    <input style={{width: '300px'}} type="text" id="name" value={this.state.nameMovie1}/>
                            </li>
                            <input className="kiemTra" type="button" value="Kiểm tra" onClick={this.handleChange3.bind(this,check) }/>
                        </ul>
                    </form>
                </div>
                <div className={check?style.OkTicket:style.CancelTicket}>
                    <h2>Xác minh đặt vé</h2>
                    <form onSubmit={addBooking}>
                        <ul>

                            <li>
                                <label htmlFor="positions">Giá</label>
                                    <input type="text" id="positions" value={this.state.price}/>
                            </li>
                            <li>
                                <label htmlFor="name">Status</label>
                                    <input style={{width: '300px'}} type="text" id="name" value={this.state.status}/>

                            </li>
                            <li>
                                <label htmlFor="name">Id Lich chieu</label>

                                <input style={{width: '300px'}} type="text" id="name" value={this.state.scheduleId}/>

                            </li>
                            <li>
                                <label htmlFor="time"> Ghế</label>
                                    <input type="text" id="time" value={this.state.seatNumber}/>
                            </li>
                            <li>
                                <label htmlFor="positions">Phòng</label>

                                <input type="text" id="positions" value={this.state.nameZoom}/>
                            </li>
                            <li>
                                <label htmlFor="name">Phim</label>

                                <input style={{width: '300px'}} type="text" id="name" value={this.state.nameMovie1}/>
                            </li>
                            <li>
                                <label htmlFor="name">Account User</label>

                                    <input style={{width: '300px'}} type="text" id="name" value="Ha Hung"/>

                            </li>
                            <input type="submit" value="Đặt vé"  onClick={this.handleChange3.bind(this,check)}/>
                            <input type="button" onClick={this.handleChange3.bind(this,check) } value="Hủy"/>
                        </ul>
                    </form>
                </div>
                <Footer/>

            </div>
        );
    }
}
const mapStateToProps = state => {
    return {u: state.myTodos.movi}}
export default connect(mapStateToProps)(withParamsAndNavigate(ShowCalendarMovie));