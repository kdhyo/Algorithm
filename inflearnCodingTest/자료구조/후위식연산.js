/* 내 풀이 */
function solution(s){  
    const stack = [];

    for(let x of s) {
        if(!isNaN(x)) {
            stack.push(+x);
        }
        else {
            const num1 = stack.pop(), num2 = stack.pop();
            if(x === "+") stack.push(num2 + num1);
            else if(x === "-") stack.push(num2 - num1);
            else if(x === "*") stack.push(num2 * num1);
            else if(x === "/") stack.push(num2 / num1);
        }
    }
    return stack[0];
}

let str="352+*9-";
console.log(solution(str));

/* 해설 풀이 */
function solution2(s){  
    let answer;
    let stack=[];
    for(let x of s){
        if(!isNaN(x)) stack.push(Number(x));
        else{
            let rt=stack.pop();
            let lt=stack.pop();
            if(x==='+') stack.push(lt+rt);
            else if(x==='-') stack.push(lt-rt);
            else if(x==='*') stack.push(lt*rt);
            else if(x==='/') stack.push(lt/rt);
        }
    }
    answer=stack[0];
    return answer;
}

let str2="352+*9-";
console.log(solution2(str2));