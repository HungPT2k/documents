import React, {Component} from 'react';
import Header from "../../Header/Header";
import Menu from "../../Menu/Menu";
import Calendar from "../Calendar/Calendar";
import PositionList from "../../../containers/position-list";
import TableList from "../../../containers/table-list";
import Footer from "../../Footer/Footer";
import Menu2 from "../Menu2/Menu2";
import Header1 from "../Content1/Heard1/Header1";
import Hearder2 from "../Content2/Header2/Hearder2";
import ListCinema from "../Content2/ListCinema/ListCinema";
import Ticket from "../Ticket/Ticket";

// import 'bootstrap/dist/css/bootstrap.min.css';
import style from "../../Css/base.module.scss";
class AppTicket extends Component {
    render() {
        return (
            <div>
                <div className={style.wrapper}>
                    <Header></Header>
                    <Menu></Menu>
                    <Menu2></Menu2>
                    <div className={style.container}>
                        <Calendar/>

                    </div>
                    <Footer></Footer>
                </div>

            </div>
        );
    }
}

export default AppTicket;