import React, {Component} from 'react';
import {Link} from "react-router-dom";
import style from "../Css/base.module.scss";
class Menu extends Component {
    render() {
        return (
            <div  className={style.menu}>
                <nav>
                <ul>
                    <li><Link to="/datve">Mua Vé</Link></li>
                    <li><Link to="/phim">Phim</Link></li>
                    <li><Link to="/home">Home</Link></li>
                    <li><Link to="/km">Contact Us</Link></li>
                    <li><Link to="/account">Account</Link></li>
                </ul>
                    </nav>
            </div>
        );
    }
}

export default Menu;