/* 내 풀이 */
function solution(a, b, c){
    return Math.min(a, b, c);
}

/* 해설 풀이 */
function solution2(a, b, c){
    let answer;
    if(a<b) answer=a;
    else answer=b;
    if(c<answer) answer=c; 
    return answer;
}

console.log(solution(2, 5, 1));
console.log(solution2(2, 5, 1));