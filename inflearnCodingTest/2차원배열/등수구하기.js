/* 내 풀이 */
function solution(arr){  
    let sortArr = [...arr].sort((a, b) => b - a);
    return arr.map(num => sortArr.indexOf(num) + 1);
}

/* 해설 풀이 */
function solution2(arr){  
    let n=arr.length;
    let answer=Array.from({length:n}, ()=>1);
    for(let i=0; i<n; i++){
        for(let j=0; j<n; j++){
            if(arr[j]>arr[i]) answer[i]++;
        }
    }             
    return answer;
}

let arr=[87, 89, 92, 100, 76];
console.log(solution(arr));