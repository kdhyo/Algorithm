/* 내 풀이 */
function solution(arr){
    let answer=arr;
    for(let i = 0; i < arr.length; i++) {
        let min = answer[i];
        let minIdx = i;
        for(let j = i; j < arr.length; j++) {
            if(min > answer[j]) {
                min = answer[j];
                minIdx = j;
            }
        }
        if(minIdx !== i) {
            answer[minIdx] = answer[i];
            answer[i] = min;
        }
    }
    return answer;
}

let arr=[13, 5, 11, 7, 23, 15];
console.log(solution(arr));

/* 해설 풀이 */
function solution2(arr){
    let answer=arr;
    for(let i=0; i<arr.length; i++){
        let idx=i;
        for(let j=i+1; j<arr.length; j++){
            if(arr[j]<arr[idx]) idx=j;
        }
        [arr[i], arr[idx]] = [arr[idx], arr[i]];
    } 
    return answer;
}

let arr2=[13, 5, 11, 7, 23, 15];
console.log(solution2(arr2));