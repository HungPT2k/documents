import React, {Component} from 'react';
import "../Css/curd.css";
import {Link} from "react-router-dom";
class MenuCurd extends Component {
    render() {
        return (
            <div>
                <div className="menuCurd">
                    <nav>
                    <ul>
                        <li><Link to="/admin/movieCurd">Movies</Link></li>
                        <li><Link to="/admin">CalendarFilm</Link></li>
                        <li><Link to="/admin/ZoomCurd">Show Schedule</Link></li>
                        <li><Link to="/admin/SeatCurd">Seat</Link></li>
                        <li><Link to="/admin/AdminCurd">Admin</Link></li>
                    </ul>
                    </nav>
                </div>
            </div>
        );
    }
}

export default MenuCurd;