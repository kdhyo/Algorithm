/* 내 풀이 */
function solution(s){
    return s.replace(/A/g, "#");
}

/* 해설 풀이 */
function solution2(s){
    let answer="";
    for(let x of s){
        if(x=='A') answer+='#';
        else answer+=x;
    }
    return answer;
}

let str="BANANA";
console.log(solution(str));