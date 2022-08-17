import React, {Component} from 'react';
import Header from "../../Header/Header";
import Menu from "../../Menu/Menu";
import Footer from "../../Footer/Footer";
import "../css/home.css"

class AppHome extends Component {
    constructor(props) {
        super(props);
        this.state = {
            Data: [
                {img1: "https://kenh14cdn.com/2020/6/19/photo-1-15925699405991805534659.jpg"},
                {img1: "https://kenh14cdn.com/thumb_w/660/203336854389633024/2021/9/16/2421948123919464423048475698253483610853534n-16317825879212041310772.jpg"},
                {img1: "https://thegioidienanh.vn/stores/news_dataimages/kimanh/052017/21/09/5321_Chien_lang_2.jpg"},
                {img1: "https://static1.dienanh.net/upload/202203/bd0fac91-7be8-4d9c-b7fd-d37f8ae0ffc8.jpeg"}
            ],

        };
    }

    render() {

        return (
            <div>

                <Header></Header>
                <Menu></Menu>

                <div className="ImgHome">
                    {/*<img*/}
                    {/*    src="https://media.istockphoto.com/vectors/cinema-ticket-booking-web-page-template-vector-isometric-cinema-page-vector-id1158427229"/>*/}

                    <img src="https://mtg.1cdn.vn/2020/08/03/32/images-motthegioi-vn_3_augo.jpg"/>
                </div>
                    <div className="imgVe">
                    <img  src="https://cinestar.com.vn/pictures/moi/BANG%20GIA%20VE/Bang%20gia%20ve%20Quoc%20Thanh%202D%20102017.jpg"/>
                    </div>

                <Footer></Footer>
            </div>
        );
    }
}

export default AppHome;