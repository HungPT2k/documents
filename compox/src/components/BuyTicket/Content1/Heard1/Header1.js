import React, {Component} from 'react';
import style from "../../../Css/base.module.scss";
class Header1 extends Component {
    render() {
        return (
            <div  className={style.header1}>
                <ul>
                    <li>Phòng chiếu</li>
                </ul>
                <ul>
                    <a>Đăng nhập đề đặt vé</a>
                    <button>Đăng nhập</button>
                </ul>
            </div>
        );
    }
}

export default Header1;