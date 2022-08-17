import React, {Component} from 'react';
import "./login.css";
import axios from "axios";
import AppAdmin from "../Admin/AppAdmin/AppAdmin";
import AppTicket from "../BuyTicket/AppTicket/AppTicket";
import { useNavigate } from "react-router-dom";
import {withParamsAndNavigate} from "../Auth/Auth";
import {connect} from "react-redux";
import {markComplete1, markComplete2} from "../../store/actions/todoActions";
import PropTypes from "prop-types";
class Login extends Component {
    constructor() {
        super();
        this.state = {
            user: [],
            statuss:"",
            userName: "",
            pass: "",
            checkLogin:true,
            roles:0,
        }
        //this.markComplete1=this
    }
    componentDidMount() {
        this.checkLogin();
    }

    checkLogin=()=>{

        axios.get("http://localhost:8080/api/v1/user/login/"+ this.state.userName+'/'+this.state.pass)
            .then(response=>response.data).then((data)=>{
                this.setState({user:data.data,statuss:data.status,roles:data.roles});
           if(data.status==="Ok")
           {
               alert(data.message+data.data.fullName);
             this.props.markComplete2(data.data.userId);}

           else {
               alert(data.message);
           }
        });
    }
    // handleStore=() =>{
    //
    //
    //  {this.props.navigate("/app");}
    //
    //
    //
    // }
    onChange = (e) => this.setState({ [e.target.name]: e.target.value });
    render() {
        const{navigate} = this.props;
        const { userName,pass,statuss,roles,user} = this.state;
     if (statuss === "Ok" ) {
          if(roles===1) {
              navigate("/home");
              localStorage.setItem('userDB1', user);
          }

         else if(roles===0)  navigate("/admin");
     }
      //  const appTicket=(<AppTicket/>)
      return (
            <div>
                <div className="login-wrap">
                    <div className="login-html">
                        <input id="tab-1" type="radio" name="tab" className="sign-in" defaultChecked /><label htmlFor="tab-1" className="tab">Sign In</label>
                        <input id="tab-2" type="radio" name="tab" className="sign-up" /><label htmlFor="tab-2" className="tab">Sign Up</label>
                        <div className="login-form">

                                <div className="sign-in-htm">
                                    <div className="group">
                                        <label htmlFor="user" className="label">Username</label>
                                        <input id="user" type="text" className="input" name="userName" value={userName} onChange={this.onChange}/>
                                    </div>
                                    <div className="group">
                                        <label htmlFor="pass" className="label">Password</label>
                                        <input id="pass" type="password" className="input"  name="pass" value={pass} onChange={this.onChange} />
                                    </div>
                                    {/*<div className="group">*/}
                                    {/*    <input id="check" type="checkbox" className="check" defaultChecked />*/}
                                    {/*    <label htmlFor="check"><span className="icon" /> Keep me Signed in</label>*/}
                                    {/*</div>*/}
                                    <div className="group">
                                        <input type="submit" className="button" defaultValue="Sign In" onClick={this.checkLogin} />
                                    </div>
                                    <div className="hr" />
                                    <div className="foot-lnk">
                                        <a href="#forgot">Forgot Password?</a>
                                    </div>
                                </div>

                            <form>
                                <div className="sign-up-htm">
                                    <div className="group">
                                        <label htmlFor="user" className="label">Username</label>
                                        <input id="user" type="text" className="input" />
                                    </div>
                                    <div className="group">
                                        <label htmlFor="pass" className="label">Password</label>
                                        <input id="pass" type="password" className="input" datatype="password" />
                                    </div>
                                    <div className="group">
                                        <label htmlFor="pass" className="label">Repeat Password</label>
                                        <input id="pass" type="password" className="input" datatype="password" />
                                    </div>
                                    <div className="group">
                                        <label htmlFor="pass" className="label">Email Address</label>
                                        <input id="pass" type="text" className="input" />
                                    </div>
                                    <div className="group">
                                        <label htmlFor="pass" className="label">Address</label>
                                        <input id="pass" type="text" className="input" />
                                    </div>
                                    <div className="group">
                                        <input type="submit" className="button" defaultValue="Sign Up" />
                                    </div>
                                    <div className="hr" />
                                    <div className="foot-lnk">
                                        <label htmlFor="tab-1">Already Member?
                                        </label></div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        );
    }
}

Login.propTypes = {
    markComplete2: PropTypes.func,
}
export default connect(null,{markComplete2})(withParamsAndNavigate(Login));