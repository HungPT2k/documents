import React, {Component} from 'react';

import style from "../../../Css/base.module.scss";
class Hearder2 extends Component {
    render() {
        return (
            <div  className={style.header2}>
                <h2>Phim</h2>
                {/*<ul>*/}
                {/*    <li><a href="#">Xem Nhiều Nhất </a></li>*/}
                {/*    <li><a href="#">Đánh Giá Tốt Nhất</a></li>*/}
                {/*</ul>*/}
            </div>
        );
    }
}

export default Hearder2;