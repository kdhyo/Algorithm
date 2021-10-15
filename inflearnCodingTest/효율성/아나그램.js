/* 내 풀이 */
function solution(str1, str2){
    return str1.split("").sort().join("") === str2.split("").sort().join("") ? "YES" : "NO";
}

let a="AbaAeCe";
let b="baeeACA";
console.log(solution(a, b));

/* 해설 풀이 */
function solution2(str1, str2){
    let answer="YES"; 
    let sH = new Map();
    for(let x of str1){
        if(sH.has(x)) sH.set(x, sH.get(x)+1);
        else sH.set(x, 1);
    }
    for(let x of str2){
        if(!sH.has(x) || sH.get(x)==0) return "NO";
        sH.set(x, sH.get(x)-1);
    }
    return answer;
}

let a2="AbaAeCe";
let b2="baeeACA";
console.log(solution2(a2, b2));