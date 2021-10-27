/* 내 풀이 */
function solution(size, arr){
    const answer = Array.from({ length : size }, () => 0);

    arr.forEach(num => {
        let idx = answer.indexOf(num);
        if(idx === -1) {
            answer.pop();
        } else {
            answer.splice(idx, 1);
        }
        answer.unshift(num);
    });

    return answer;
}

let arr=[1, 2, 3, 2, 6, 2, 3, 5, 7];
console.log(solution(5, arr));

/* 해설 풀이 */
function solution2(size, arr){
    let answer=Array.from({length:size}, ()=>0);
    arr.forEach(x => {
        let pos=-1;
        for(let i=0; i<size; i++) if(x===answer[i]) pos=i;
        if(pos===-1){
            for(let i=size-1; i>=1; i--){
                answer[i]=answer[i-1];
            }
        }
        else{
            for(let i=pos; i>=1; i--){
                answer[i]=answer[i-1];
            }
        } 
        answer[0]=x;  
    });

    return answer;
}

let arr2=[1, 2, 3, 2, 6, 2, 3, 5, 7];
console.log(solution2(5, arr2));