import React, {Component} from 'react';
import Header from "../Header/Header";
import Menu from "../Menu/Menu";
import Footer from "../Footer/Footer";
import   "./profile.css";
import {connect} from "react-redux";
import {markComplete2} from "../../store/actions/todoActions";
class Account extends Component {
    constructor() {
        super();
        this.state={

        }
    }
    componentDidMount() {

    }

    render() {
        // const db =   localStorage.getItem('userDB1');
        // const rows1 =   this.props.u.map(e => (
        //     <div className="inforUser">
        //         <ul>
        //
        //             <li>
        //                 <label htmlFor="fullName">Name</label>
        //                 <input type="text" id="fullName" value={e.movieName}/>
        //             </li>
        //             <li>
        //                 <label htmlFor="address">Address</label>
        //                 <input  type="text" id="address" value="Thanh Hóa"/>
        //
        //             </li>
        //             <li>
        //                 <label htmlFor="email">Email</label>
        //
        //                 <input  type="email" id="email" value="Admam@gmail.com"/>
        //
        //             </li>
        //             <li>
        //                 <label htmlFor="birthDay">Birth Day</label>
        //                 <input type="text" id="birthDay" value="18 - 09 - 1999"/>
        //             </li>
        //             <li>
        //                 <label htmlFor="sdt">Phone Number</label>
        //
        //                 <input type="text" id="sdt" value="045357495"/>
        //
        //             </li>
        //         </ul>
        //     </div>
        // ))
        return (
            <div>
                <Header></Header>
                <Menu></Menu>

                <div className="userProfile">
                    <h2 style={{textAlign: 'center'}}>Hello </h2>
                    <h2 style={{textAlign: 'center'}}>Ha Hung </h2>
                    <div className="card">
                        <img src="https://www.pngall.com/wp-content/uploads/12/Avatar-Profile-PNG-Picture.png" alt="John" style={{width: '100%'}} />
                        <h1>Join</h1>
                        <p className="title">CEO &amp; Founder, Example</p>
                        <p>Harvard University</p>
                        <div style={{margin: '24px 0'}}>
                            <a href="#"><i className="fa fa-dribbble" /></a>
                            <a href="#"><i className="fa fa-twitter" /></a>
                            <a href="#"><i className="fa fa-linkedin" /></a>
                            <a href="#"><i className="fa fa-facebook" /></a>
                        </div>
                        <p><button>Edit</button></p>
                    </div>
                    {
                        this.props.u.map(e => (
                            <div className="inforUser">
                                <ul>
                                    <li>{e.userId}</li>

                                    <li>
                                        <label htmlFor="fullName">Name</label>
                                        <input type="text" id="fullName" value="Ha Duyen Hung" />
                                    </li>
                                    <li>
                                        <label htmlFor="address">Address</label>
                                        <input  type="text" id="address" value="Thanh Hóa"/>

                                    </li>
                                    <li>
                                        <label htmlFor="email">Email</label>

                                        <input  type="email" id="email" value="hahung123@gmail.com"/>

                                    </li>
                                    <li>
                                        <label htmlFor="birthDay">Birth Day</label>
                                        <input type="text" id="birthDay" value="18 - 09 - 1999"/>
                                    </li>
                                    <li>
                                        <label htmlFor="sdt">Phone Number</label>

                                        <input type="text" id="sdt" value="045357495"/>

                                    </li>
                                </ul>
                            </div>
                        ))}
                </div>

                <Footer></Footer>
            </div>
        );
    }
}
const mapStateToProps = state => {
    return {u: state.myTodos.movi}
}
export default connect(mapStateToProps)(Account);