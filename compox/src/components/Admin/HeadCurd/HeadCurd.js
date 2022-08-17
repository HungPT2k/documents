import React, {Component} from 'react';
import "../Css/curd.css";
import {Link} from "react-router-dom";
class HeadCurd extends Component {
    constructor() {
        super();
       // this.handleStore=this.handleStore.bind(this);
    }
    // handleStore=() =>{
    //     localStorage.removeItem('access');
    //     //  localStorage.setItem('Password',);
    // }
    render() {
        return (
            <div>
                <div className="heardCurd">
                    <h1>Admin</h1>
                    <Link to="/"> <a >Logout</a></Link>
                </div>
            </div>
        );
    }
}

export default HeadCurd;