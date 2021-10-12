/* 내 풀이 */
function solution(s){
    s = s.toLowerCase().match(/[a-z]/g).join("");
    return s.split("").reverse().join("") === s ? "YES" : "NO";
}

/* 해설 풀이 */
function solution2(s){
    let answer="YES";
    s=s.toLowerCase().replace(/[^a-z]/g, '');
    if(s.split('').reverse().join('')!==s) return "NO";
    return answer;
}

let str="found7, time: study; Yduts; emit, 7Dnuof";
console.log(solution(str));