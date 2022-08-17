import AppTicket from "../BuyTicket/AppTicket/AppTicket";
import {
    BrowserRouter,
    Routes,
    Route,

} from "react-router-dom";
import AppHome from "../Home/AppHome/AppHome";
import AppInfor from "../Imformation/AppInfor/AppInfor";
import Login from "../Login/Login";
import {Component} from "react";
import AppCinema1 from "../Phim/AppCinema1/AppCinema1";
import ShowCalendarMovie from "../BuyTicket/AppTicket/ShowCalendarMovie";
import HistoryBuy from "../BuyTicket/AppTicket/HistoryBuy";
import {unstable_HistoryRouter as HistoryRouter} from "react-router-dom";
import {createBrowserHistory} from "history";
import MovieDetail from "../Phim/MovieDetail/MovieDetail";
import MovieCurd from "../Admin/MovieCurd/MovieCurd";
import EditMovie from "../Admin/MovieCurd/EditMovie";
import AddNewMovie from "../Admin/MovieCurd/AddNewMovie";
import AdminCurd from "../Admin/AdminCurd/AdminCurd";
import ZoomCurd from "../Admin/ZoomCurd/ZoomCurd";
import SeatCurd from "../Admin/SeatCurd/SeatCurd";
import MovieCalendar from "../Admin/MovieCalendar/MovieCalendar";
import Account from "../Account/Account";

const history = createBrowserHistory({window});

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            user: "hung",
            password: "123",
        }
    }

    render() {
        // if(this.state.user==="hung"){
        //     return (
        //         <div>
        //             <AppAdmin/>
        //         </div>
        //     )
        // }
        // else {
        return (
           < BrowserRouter>

            <Routes>
                {/*<Route path="/datve" element={<AppTicket/>}/>*/}
                <Route path="/datve" element={<ShowCalendarMovie/>}/>
                <Route path="/vedat" element={<HistoryBuy/>}/>
                <Route path="/home" element={<AppHome/>}/>
                <Route path="/km" element={<AppInfor/>}/>
                <Route path="/phim" element={<AppCinema1/>}/>
                <Route path="/account" element={<Account/>}/>
                <Route path="/" element={<Login/>}/>
                <Route path="/movidetail" element={<MovieDetail/>}/>

                <Route path="/admin" element={ <MovieCalendar/>} />
                <Route path="/admin/movieCurd" element={<MovieCurd/>}/>
                <Route path="/admin/movieCurd/edit" element={<EditMovie/>}/>
                <Route path="/admin/movieCurd/add" element={<AddNewMovie/>}/>
                <Route path="/admin/AdminCurd" element={<AdminCurd/>}/>
                <Route path="/admin/ZoomCurd" element={<ZoomCurd/>}/>
                <Route path="/admin/SeatCurd" element={<SeatCurd/>}/>
            </Routes>
       </ BrowserRouter>
        );
    }

}

export default App;
