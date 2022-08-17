import React, {Component} from 'react';
import style from "../Css/base.module.scss";
import {Link} from "react-router-dom";
class Header extends Component {
    constructor() {
        super();
        this.handleChange=this.handleChange.bind(this);
    }
handleChange=()=>{
    localStorage.clear();
}
    render() {
        return (
            <div  className={style.header}>
                <h1>KING CINEMA</h1>
                <nav>
                <ul>
                    <li onClick={this.handleChange} ><Link to="/">Đăng kí</Link></li>
                    <li><Link to="/Admin">Admin</Link></li>
                    <li><a  href="#">Hỗ trợ khách hàng</a></li>
                </ul>
                </nav>
            </div>
        );
    }
}

export default Header;