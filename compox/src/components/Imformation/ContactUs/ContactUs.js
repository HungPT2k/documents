import React, {Component} from 'react';
import "./contact.css";
class ContactUs extends Component {
    render() {
        return (
            <div>
                <div className="container">
                    <div className="map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d13249.247068040606!2d151.20960562674117!3d-33.8816236491114!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1spt-BR!2sbr!4v1468899355787" width="100%" height="650px" frameBorder={0} style={{border: 0}} allowFullScreen />
                    </div>
                    <div className="contact-form">
                        <h1 className="title">Contact Us</h1>
                        <h2 className="subtitle">We are here assist you.</h2>
                        <form action>
                            <input type="text" name="name" placeholder="Your Name" />
                            <input type="email" name="e-mail" placeholder="Your E-mail Adress" />
                            <input type="tel" name="phone" placeholder="Your Phone Number" />
                            <textarea name="text" id rows={8} placeholder="Your Message" defaultValue={""} />
                            <button className="btn-send">Get a Call Back</button>
                        </form>
                    </div>
                </div>
            </div>
        );
    }
}

export default ContactUs;