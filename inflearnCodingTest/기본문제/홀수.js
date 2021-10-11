/* 내 풀이 */
function solution(arr) {
    const old = arr.filter(num => num % 3 == 0);
    return [old.reduce((acc, cur) => acc + cur), Math.min(...old)];
}

/* 해설 풀이 */
function solution(arr){
    let answer=[];
    let sum=0, min=1000;
    for(let x of arr){
        if(x%2===1){
            sum+=x;
            if(x<min) min=x;
        }
    }
    answer.push(sum);
    answer.push(min);     
    return answer;
}

let arr=[12, 77, 38, 41, 53, 92, 85];
console.log(solution(arr));