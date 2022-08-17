import React, {Component} from 'react';
import HeadCurd from "../HeadCurd/HeadCurd";
import MenuCurd from "../MenuCurd/MenuCurd";
import "./calendar2.css";
import axios from "axios";
class ZoomCurd extends Component {
    constructor() {
        super();
        this.state={
            datas:[],
            date:"",
            idSc:"15",
        }
this.handleChange=this.handleChange.bind(this);

    }

    componentDidMount() {
        this.getScheduleByDate();
this.deleteScheduleById();
    }
    onChange = (e) => this.setState({ [e.target.name]: e.target.value } );

    getScheduleByDate=()=> {

        axios.get("http://localhost:8080/ap1/v1/schedule/show/" + this.state.date.toString())
            .then(response => response.data).then((data) => {
            this.setState({
                datas:data
            });
        });

    }
    handleChange=(e)=>{
        this.setState({idSc:e})
    }
    deleteScheduleById=()=> {

        axios.get("http://localhost:8080/ap1/v1/schedule/delete/" + this.state.idSc)
            .then(response => response.data).then((data) => {
            alert(data.message);
        });

    }

    render() {
        const{date} = this.state;
        const rows = this.state.datas.map(e => (
            <div>
                <div className="boxSchedule2">
                    <div className="potter2" >
                        <img src={e.moviePoster} />
                    </div>
                    <div className="inforShow2" onClick={this.handleChange.bind(this,e.scheduleId)}>
                        <ul>
                            <li>
                                <h2>{e.movieName}</h2>
                            </li>
                            <li>
                                <button >{e.zoomName}</button>
                                <input type="submit" value="Xóa" onClick={this.deleteScheduleById}/>
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
        return (
            <div>
                <HeadCurd/>
                <MenuCurd/>

                <div className="containerCurd">
                            <div className="showSchedule2">
                                <div className="choseDate">

                                    <label htmlFor="pwd">Chọn ngày:</label><br />
                                    <input type="date" id="pwd" name="date"  value={date} onChange={this.onChange} /><br />
                                    <input type="submit" onClick={this.getScheduleByDate}  value="Xem"/><br />

                                </div>
                                {rows}

                            </div>
                        </div>

                        </div>
        );
    }
}

export default ZoomCurd;