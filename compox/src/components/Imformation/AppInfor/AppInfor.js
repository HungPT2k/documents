import React, {Component} from 'react';
import Header from "../../Header/Header";
import Menu from "../../Menu/Menu";
import Footer from "../../Footer/Footer";
import style from "../../Css/base.module.scss"
import ContactUs from "../ContactUs/ContactUs";
class AppInfor extends Component {
    render() {
        return (
            <div>

                    <Header></Header>
                    <Menu></Menu>
                    <ContactUs/>
                <Footer></Footer>
            </div>
        );
    }
}

export default AppInfor;