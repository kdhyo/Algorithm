/* 내 풀이 */
function solution(a, b, c) {
    const max = Math.max(a, b, c);
    const sum = [a, b, c].reduce((acc, cur) => acc + cur);

    return sum - max > max ? "YES" : "NO";
}

/* 해설 풀이 */
function solution(a, b, c){
    let answer="YES", max;
    let tot=a+b+c;
    if(a>b) max=a;
    else max=b;
    if(c>max) max=c;
    if(tot-max<=max) answer="NO"; 
    return answer;
}

console.log(solution(13, 33, 17));
console.log(solution(6, 7, 11));