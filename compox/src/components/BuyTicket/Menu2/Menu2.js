import React, {Component} from 'react';
import style from "../../Css/base.module.scss";
import {Link} from "react-router-dom";
class Menu2 extends Component {
    render() {
        return (
            <div  className={style.menu2}>
                <nav>
                <ul>
                    {/*<li><Link to="/muave">Mua Vé Xem Phim</Link></li>*/}
                    <li><Link to="/datve">Mua vé</Link></li>
                    <li><Link to="/vedat">Vé đã mua</Link></li>
                </ul>
                    </nav>
            </div>
        );
    }
}

export default Menu2;