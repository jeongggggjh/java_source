// 변수 내보내기
export let user = '홍길동';

// JSON 형식의 자료 내보내기
const name = '사과';
const price = 5600;
export let msg = {name, price};

// 함수 내보내기
export function sayHi(user) {
	return `ㅎㅇ? ${user}`;
}

export let func = function add(a, b) {
	return a + b;
}

function f1(user) {
	return `ㅎㅇ? ${user}`;
}

function f2(user) {
	return `반갑 ㅋㅋ ${user}`;
}

export {f1, f2}; // 두 개 함수 내보내기

// default값 내보내기
export default '잠와도 이겨내자';

// 배열 내보내기
export let months = ['5월', '6월', '7월'];

// 상수 내보내기 
export const Cur_YEAR = 2024;

// 클래스 내보내기 
export class HelloClass {
	constructor(msg) {
		this.msg = msg;
	}
}

// 동적으로 함수 내보내기 
export function hi() {
	alert('ㅎㅇㅋㅋ');
}
export function bye() {
	alert('ㅂㅇㅋㅋ');
}
