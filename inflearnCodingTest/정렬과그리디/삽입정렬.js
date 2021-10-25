/* 내 풀이 */
function solution(arr){
    let answer=arr;
    for(let i = 1; i < arr.length; i++) {
        const num = arr[i];
        let prev = i - 1;
        while((prev >= 0) && (arr[prev] > num)) {
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = num;
    }
    return answer;
}

let arr=[11, 7, 5, 6, 10, 9];
console.log(solution(arr));

/* 해설 풀이 */
function solution2(arr){
    let answer=arr;
    for(let i=0; i<arr.length; i++){
        let tmp=arr[i], j;
        for(j=i-1; j>=0; j--){
            if(arr[j]>tmp) arr[j+1]=arr[j];
            else break;
        }
        arr[j+1]=tmp;
    } 
    return answer;
}

let arr2=[11, 7, 5, 6, 10, 9];
console.log(solution2(arr2));

/* 해설 풀이 */
function solution3(arr){
    let answer=[];
    answer.push(arr[0]);
    for(let i=1; i<arr.length; i++){
        for(let j=0; j<answer.length; j++){
            if(arr[i]<answer[j]){
                answer.splice(j, 0, arr[i]);
                break;
            } 
        }
    }
    return answer;
}

let arr3=[11, 7, 5, 6, 10, 9];
console.log(solution3(arr3));