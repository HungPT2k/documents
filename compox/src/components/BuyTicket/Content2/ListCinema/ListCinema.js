import React, {Component} from 'react';
import style from "../../../Css/base.module.scss";
import {connect} from "react-redux";
import { markComplete2} from "../../../../store/actions/todoActions";
import PropTypes from "prop-types";
const ListCinema = ({ d, markComplete2 }) => {
        let arr=String(d.map(e => (
            (e.listMovie))));
        let arr1=arr.split(',');
        // var listItems = arr1.map(e => (
        //     <li onClick={markComplete2.bind(this,e)}><a>{e}</a></li>
        // ));
        return (
            <div  className={style.list}>
                <ol>
                    <ul>
                        { arr1.map(e => (
                        <li onClick={markComplete2.bind(this,e)}><a>{e}</a></li>
                        ))};
                    </ul>
                </ol>
            </div>
        );

}
ListCinema.propTypes = {
    markComplete2: PropTypes.func,
}
const mapStateToProps = state => {
    return {d: state.myTodos.datas}
}

export default connect(mapStateToProps,{markComplete2})(ListCinema);
