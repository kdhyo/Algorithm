/* 내 풀이 */
function solution(arr){         
    for(let i = 1; i < arr.length; i++) {
        if(arr[i] === 1) {
            arr[i] = arr[i - 1] + 1;
        }
    }
    return arr.reduce((acc, cur) => acc+cur);
}

/* 해설 풀이 */
function solution2(arr){         
    let answer=0, cnt=0;
    for(let x of arr){
        if(x===1){
            cnt++;
            answer+=cnt;
        }
        else cnt=0;
    }
       
    return answer;
}

let arr=[1, 0, 1, 1, 1, 0, 0, 1, 1, 0];
console.log(solution(arr));