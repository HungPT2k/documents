import { ADD_TODO, MARK_COMPLETE,MARK_COMPLETE1,MARK_COMPLETE2, DELETE_TODO, GET_TODOS } from '../types'


let initialState;
initialState = {
	todos1: [
		{
		zoomName:"101",
			id: 1,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28',
			movie: 'BỐ GIÀ,HARRY PORTER 3'
		},
		{
			zoomName: "102",
			id: 2,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22',
			movie: 'LIÊN MINH CÔNG LÝ,BỐ GIÀ,HARRY PORTER 3'
		},

		{
			zoomName: "103",
			id: 3,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20',
			movie: 'CON LẮC TÀ THUẬT,BỐ GIÀ,HARRY PORTER 3'
		},

		{
			zoomName: "104",
			id: 4,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14',
			movie: 'Bẫy Ngọt Ngào,BỐ GIÀ,HARRY PORTER 2'
		},

		{
			zoomName: "105",
			id: 5,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18',
			movie: 'Pachinko,BỐ GIÀ,HARRY PORTER 4'
		},

		{
			zoomName: "106",
			id: 6,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16',
			movie: 'Phù Thuỷ Tối Thượng 2,BỐ GIÀ,HARRY PORTER 5'
		},

		{
			zoomName: "107",
			id: 7,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23',
			movie: 'Cuộc Trỗi Dậy,HARRY PORTER 7'
		},

		{
			zoomName: "108",
			id: 8,
			position3: '1,2,3,4,5,6,7,8,9,10,11',
			movie: 'Phi Công Siêu Đẳng Maverick,BỐ GIÀ,HARRY PORTER 3'
		},
		{
			zoomName: "109",
			id: 9,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17',
			movie: 'Người Sống Sót,BỐ GIÀ,HARRY PORTER 3'
		},
	],
	todos: [

	],
	datas: [
		{zoomName: "101", listMovie: 'NGƯỜI SẮT,BỐ GIÀ,HARRY PORTER 3'},
	],
	datas1: [
		{
			zoomName: "101",
			id: 1,
			position3: '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28',
			movie: 'BỐ GIÀ,HARRY PORTER 3'
		},],
	listCinemas: [],
	zooms: [],
	seat: [
		{name: "1"},
	],
	movi: [
		{userId: "2"},
	],
	users:[],

};

const todoReducer = (state = initialState, action) => {
	switch (action.type) {
		case GET_TODOS:
			return {
				...state,
		todos:action.payload,
			}

		case MARK_COMPLETE:
			return {
				...state,
				datas:state.todos.filter(todo => todo.zoomName== action.payload)
				}
		case MARK_COMPLETE1:
			return {
				...state,
				users: action.payload,
			}
		case MARK_COMPLETE2:
			return {
				...state,
				movi:[
					{
						userId: action.payload,
					}
				]
			}
		case ADD_TODO:
			return {
				...state,
				listCinemas: [...state.listCinemas, action.payload]
			}

		case DELETE_TODO:
			return {
				...state,
				todos: state.todos.filter(todo => todo.id !== action.payload)
			}

		default:
			return state  // dữ liệu mặc định khi k l

		}

	}




export default todoReducer
