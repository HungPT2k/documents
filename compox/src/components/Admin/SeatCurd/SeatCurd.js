import React, {Component} from 'react';
import HeadCurd from "../HeadCurd/HeadCurd";
import MenuCurd from "../MenuCurd/MenuCurd";

class SeatCurd extends Component {
    render() {
        return (
            <div>
                <HeadCurd/>
                <MenuCurd/>
            </div>
        );
    }
}

export default SeatCurd;