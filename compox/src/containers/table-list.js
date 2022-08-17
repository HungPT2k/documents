import React, {Component} from 'react';
import {connect} from "react-redux";
import style from "../components/Css/base.module.scss";
import PropTypes from "prop-types";
import {markComplete1} from "../store/actions/todoActions";


 const TableList = ({ d, markComplete1 }) => {
      // function  buildTable (){
        let arr=String(d.map(e => (
          (e.position3))));
       let arr1=arr.split(',');

        let dataTable=[];
        let a=[];
        for (let i = 0; i < arr1.length; i++){
            a.push(arr1[i]);
            if(a.length===7 || i===(arr1.length-1)){
                dataTable.push(a);
                a=[];}

        }
        // const rows = dataTable.map((row,i) => {
        //     return <tr key={i}>
        //         <td><button onClick={markComplete1.bind(this,row[0])} >{row[0]}</button></td>
        //         <td><button onClick={markComplete1.bind(this,row[1])}>{row[1]}</button></td>
        //         <td><button onClick={markComplete1.bind(this,row[2])}>{row[2]}</button></td>
        //         <td><button onClick={markComplete1.bind(this,row[3])}>{row[3]}</button></td>
        //         <td><button onClick={markComplete1.bind(this,row[4])}>{row[4]}</button></td>
        //         <td><button onClick={markComplete1.bind(this,row[5])}>{row[5]}</button></td>
        //         <td><button onClick={markComplete1.bind(this,row[6])}>{row[6]}</button></td>
        //     </tr>
        // })
        // return <table border={1}><tbody>{rows}</tbody></table>
    // }
        return (
            <div>
                <div>
                    <table border={1}><tbody>
                    {   dataTable.map((row,i) => {
                        return <tr key={i}>
                            <td>
                                <button onClick={markComplete1.bind(this, row[0])}>{row[0]}</button>
                            </td>
                            <td>
                                <button onClick={markComplete1.bind(this, row[1])}>{row[1]}</button>
                            </td>
                            <td>
                                <button onClick={markComplete1.bind(this, row[2])}>{row[2]}</button>
                            </td>
                            <td>
                                <button onClick={markComplete1.bind(this, row[3])}>{row[3]}</button>
                            </td>
                            <td>
                                <button onClick={markComplete1.bind(this, row[4])}>{row[4]}</button>
                            </td>
                            <td>
                                <button onClick={markComplete1.bind(this, row[5])}>{row[5]}</button>
                            </td>
                                <td >
                                    <button style={row[6]===null?{display:"none"}:{display:"block"}} onClick={markComplete1.bind(this, row[6])}>{row[6]}</button>
                                </td>
                        </tr>

                    })}
                        </tbody></table>
                </div>
            </div>
        );
}
TableList.propTypes = {
    markComplete1: PropTypes.func,
}
const mapStateToProps = state => {
    return {d: state.myTodos.datas1}
}

export default connect(mapStateToProps,{markComplete1})(TableList);