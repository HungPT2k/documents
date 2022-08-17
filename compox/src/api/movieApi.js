import axiosClient from "./axiosClient";

class movieApi {
    getAll ()  {
        const url = '/movies';
        return axiosClient.get(url);

            }
    getAllZoom ()  {
        const url = '/zoom';
        return axiosClient.get(url);

    }
    getOne (params)  {
        const url = '/movies/{id}';
        return axiosClient.get(url,{params});

    }
    addMovie(params){
        const url = '/movies/insert';
        return axiosClient.post(url,params).then(res => {
            console.log(JSON.stringify(res.data));
            alert(res.data.message);
        });
    }

    
}
export default new movieApi();