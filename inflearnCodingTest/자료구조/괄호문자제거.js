/* 내 풀이 */
function solution(s) {
    const answer = [];
    const stack = [];

    for(let x of s) {
        if(x === "(") stack.push("(");
        else if(x === ")") stack.pop();
        else if(stack.length === 0) {
            answer.push(x);
        }
    }
    return answer.join("");
}

let str="(A(BC)D)EF(G(H)(IJ)K)LM(N)";
console.log(solution(str));

/* 해설 풀이 */
function solution2(s){  
    let answer;
    let stack=[];
    for(let x of s){
        if(x===')'){
            while(stack.pop()!=='(');
        }
        else stack.push(x);
    }
    answer=stack.join('');
    return answer;
}

let str2="(A(BC)D)EF(G(H)(IJ)K)LM(N)";
console.log(solution2(str2));
