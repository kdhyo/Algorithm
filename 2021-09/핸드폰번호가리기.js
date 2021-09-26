function solution(phone_number) {
    const SIZE = phone_number.length - 4;
    return phone_number.split("").map((num, idx) => idx < SIZE ? "*" : num).join("");
}

console.log(solution(01033334444));

/* 
    다른사람의 풀이 배운 코드
    정규식 : 뒤에 4개의 숫자가 붙은 앞에 숫자들을 * 로변환
*/

function hide_numbers(s) {
    return s.replace(/\d(?=\d{4})/g, "*");
}