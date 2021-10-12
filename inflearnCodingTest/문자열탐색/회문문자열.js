/* 내 풀이 */
function solution(a){
    let b = '';
    a = a.toLowerCase();
    for(let i = a.length - 1; i >= 0; i--) {
        b += a.charAt(i);
    }

    return a === b ? "YES" : "NO";
}

/* 해설 풀이 */
function solution2(s){
    let answer="YES";
    s=s.toLowerCase();
    let len=s.length - 1;
    for(let i=0; i<Math.floor(len/2); i++){
        if(s[i]!=s[len-i]) return "NO";
    }
    return answer;
}

function solution3(s){
    let answer="YES";
    s=s.toLowerCase();
    if(s.split('').reverse().join('')!=s) return "NO";    
    return answer;
}

let str="goooG";
console.log(solution2(str));