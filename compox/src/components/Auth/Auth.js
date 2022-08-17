import { useParams,useLocation, useNavigate,createStackNavigator  } from "react-router-dom";
export function withParamsAndNavigate(Component) {
    return (props) => (
        <Component {...props} params={useParams()} navigate={useNavigate() } location={useLocation()} />
    );
}
// import {
//     useLocation,
//     useNavigate,
//     useParams
// } from "react-router-dom";
//
// export const withParamsAndNavigate = (Component) =>  {
//     function ComponentWithRouterProp(props) {
//         let location = useLocation();
//         let navigate = useNavigate();
//         let params = useParams();
//         return (
//             <Component
//                 {...props}
//                 router={{ location, navigate, params }}
//             />
//         );
//     }
//     return ComponentWithRouterProp;}
