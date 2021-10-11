/* 내 풀이 */
function solution(s){  
    let answer = "";
    const SIZE = s.length;
    const num = Math.floor(SIZE / 2);

    if(SIZE % 2 === 0) answer = s.substring(num - 1, num + 1);
    else answer = s.substring(num, num + 1);

    return answer;
}


/* 해설 풀이 */
function solution2(s){  
    let answer;
    let mid=Math.floor(s.length/2)
    if(s.length%2===1) answer=s.substring(mid, mid+1);
    else answer=s.substring(mid-1, mid+1);
    //if(s.length%2===1) answer=s.substr(mid, 1);
    //else answer=s.substr(mid-1, 2);
    return answer;
}

console.log(solution("study"));
console.log(solution("good"));