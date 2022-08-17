import React, {Component} from 'react';
import style from "../../Css/base.module.scss";
class Calendar extends Component {
    render() {
        return (

                <div className={style.calendar}>
                    <button style={{width: '50px', backgroundColor: '#8aff36'}}>⇦</button>
                    <button style={{float: 'right', width: '50px', backgroundColor: '#8aff36'}}>⇨</button>
                    <table>
                        <tbody>
                        <tr>
                            <td>Monday</td>
                            <td>Tuesday</td>
                            <td>Wednesday</td>
                            <td>Thursday</td>
                            <td>Friday</td>
                            <td>Saturday</td>
                            <td>Sunday</td>
                        </tr>
                        <tr>
                            <td>
                                <button style={{borderRadius: '10px', width: '30px', backgroundColor: '#fffb72'}}>11</button>
                            </td>
                            <td>
                                <button style={{borderRadius: '10px', width: '30px', backgroundColor: '#fffb72'}}>12</button>
                            </td>
                            <td>
                                <button style={{borderRadius: '10px', width: '30px', backgroundColor: '#fffb72'}}>13</button>
                            </td>
                            <td>
                                <button style={{borderRadius: '10px', width: '30px', backgroundColor: '#fffb72'}}>14</button>
                            </td>
                            <td>
                                <button style={{borderRadius: '10px', width: '30px', backgroundColor: '#fffb72'}}>15</button>
                            </td>
                            <td>
                                <button style={{borderRadius: '10px', width: '30px', backgroundColor: '#fffb72'}}>16</button>
                            </td>
                            <td>
                                <button style={{borderRadius: '10px', width: '30px', backgroundColor: '#fffb72'}}>17</button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>

        );
    }
}

export default Calendar;