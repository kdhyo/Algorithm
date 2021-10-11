/* 내 풀이 */
function solution(arr){
    let sum = arr.reduce((acc, cur) => acc + cur);
    for(let i = 0; i < 8; i++) {
        for(let j = i + 1; j < 9; j++) {
            if((sum - arr[i] - arr[j]) === 100) {
                arr.splice(j, 1);
                arr.splice(i, 1);
                return arr;
            }
        }
    }
    return null;
}

/* 해설 풀이 */
function solution2(arr){
    let answer=arr;
    let sum=answer.reduce((a, b)=>a+b, 0);
    for(let i=0; i<8; i++){
        for(let j=i+1; j<9; j++){
            if((sum-(answer[i]+answer[j]))==100){
                answer.splice(j, 1);
                answer.splice(i, 1);
            }
        }
    }
    return answer;
}

arr=[20, 7, 23, 19, 10, 15, 25, 8, 13];
console.log(solution(arr));