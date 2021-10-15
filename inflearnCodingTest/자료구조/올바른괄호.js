/* 내 풀이 */
function solution(s){
    let lt = 0;
    let rt = 0;
    for(let x of s) {
        if(x === "(") lt++;
        else rt++;
    }
    return lt === rt ? "YES" : "NO";
}

let a="(()(()))(()";
console.log(solution(a));

/* 해설 풀이 */
function solution2(s){
    let answer="YES";
    stack=[];
    for(let x of s){
        if(x==='(') stack.push(x);
        else{
            if(stack.length===0) return "NO";
            stack.pop();
        }
    }
    if(stack.length>0) return "NO";  
    return answer;
}

let b="(()(()))(()";
console.log(solution2(b));
