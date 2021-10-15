/* 내 풀이 */
function solution(s){  
    let answer = '', max = Number.MIN_SAFE_INTEGER;
    const hash = {};
    for(let x of s) {
        hash[x] = hash[x] !== undefined ? hash[x] + 1 : 1;
    }

    for (const [key, value] of Object.entries(hash)) {
        if(value > max) {
            max = value;
            answer = key;
        }
    }

    return answer;
}

let str="BACBACCACCBDEDE";
console.log(solution(str));

/* 해설 풀이 */
function solution2(s){  
    let answer;
    let sH = new Map();
    for(let x of s){
        if(sH.has(x)) sH.set(x, sH.get(x)+1);
        else sH.set(x, 1);
    }
    let max=Number.MIN_SAFE_INTEGER;
    for(let [key, val] of sH){
        if(val>max){
            max=val;
            answer=key;
        }
    }
    return answer;
}

let str2="BACBACCACCBDEDE";
console.log(solution2(str2));