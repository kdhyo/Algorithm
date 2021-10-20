/* 내 풀이 */
function solution(need, plan){
    const queue = need.split("");
    let str = queue.shift();

    for(let i = 0; i < plan.length; i++) {
        if(plan[i] === str) str = queue.shift();
    }

    return need.length === 0 ? "YES" : "NO";
}

let a="CBA";
let b="CBDAGE";
console.log(solution(a, b));

/* 해설 풀이 */
function solution2(need, plan){
    let answer="YES";
    let queue=need.split('');
    for(let x of plan){
        if(queue.includes(x)){
            if(x!==queue.shift()) return "NO";
        }
    }
    if(queue.length>0) return "NO";  
    return answer;
}

let a2="CBA";
let b2="CBDAGE";
console.log(solution2(a2, b2));