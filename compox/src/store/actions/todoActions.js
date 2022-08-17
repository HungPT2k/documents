import axios from 'axios'
import { MARK_COMPLETE,ADD_TODO,MARK_COMPLETE1,MARK_COMPLETE2,  GET_TODOS ,GET_ZOOM} from '../types'
import movieApi from "../../api/movieApi";

/* export const markComplete = () => {
	const markCompleteAction = dispatch => {
		dispatch({
			type: 'MARK_COMPLETE',
			payload: 'my payload'
		})
	}

	return markCompleteAction
} */

export const getTodos = () => async dispatch => {
	try {
	//	const response = await movieApi.getAllZoom();
		const response =	await axios.get("http://localhost:8080/ap1/v1/schedule/movieOfZoom")
		dispatch({
			type: GET_TODOS,
			payload: response.data,
		})
	} catch (error) {
		console.log(error)
	}
}

export const markComplete = (id1)=> dispatch => {
	dispatch({
		type: MARK_COMPLETE,
		payload: id1
	})
}
export const markComplete1 = (us)=> dispatch => {
	dispatch({
		type: MARK_COMPLETE1,
		payload: us
	})
}
export const markComplete2 = (movieName)=> dispatch => {
	dispatch({
		type: MARK_COMPLETE2,
		payload: movieName
	})
}
export const addTodo = newTodo => async dispatch => {
	try {
		await movieApi.addMovie(newTodo);
		dispatch({
			type: ADD_TODO,
			payload: newTodo
		})
	} catch (error) {
		console.log(error)
	}
}
//
// export const deleteTodo = id => async dispatch => {
// 	try {
// 		await axios.delete(`https://jsonplaceholder.typicode.com/todos/${id}`)
// 		dispatch({
// 			type: DELETE_TODO,
// 			payload: id
// 		})
// 	} catch (error) {
// 		console.log(error)
// 	}
// }
