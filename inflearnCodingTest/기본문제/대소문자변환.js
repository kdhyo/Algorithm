/* 내 풀이 */
function solution(s){         
    let answer="";
    for(let x of s) {
        // if(x === x.toUpperCase()) answer += x.toLowerCase();
        // else answer += x.toUpperCase();
        let num = x.charCodeAt();
        if(65 <= num && num <= 90) answer += String.fromCharCode(num + 32);
        else answer += String.fromCharCode(num - 32);
    }
    return answer;
}

/* 해설 풀이 */
function solution2(s){  
    let answer="";
    for(let x of s){
        if(x===x.toUpperCase()) answer+=x.toLowerCase();
        else answer+=x.toUpperCase();
    }
    return answer;
}

let str="StuDY";
console.log(solution(str));