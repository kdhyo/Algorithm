/* 내 풀이 */
function solution(n, k){
    let queue = Array.from({length : n}, (_, idx) => idx + 1);
    let idx = 1;

    while(queue.length > 1) {
        const queue2 = [];
        for(let i = 0; i < queue.length; i++) {
            if(idx === k) idx = 0;
            else queue2.push(queue[i]);
            idx++;
        }
        
        queue = queue2;
    }

    return queue[0];
}

console.log(solution(8, 3));

/* 해설 풀이 */
function solution2(n, k){
    let answer;
    let queue=Array.from({length:n}, (v, i)=>i+1); 
    while(queue.length){
        for(let i=1; i<k; i++) queue.push(queue.shift());
        queue.shift();
        if(queue.length===1) answer=queue.shift();
    }  
    return answer;
}

console.log(solution2(8, 3));