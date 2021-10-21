/* 내 풀이 */
function solution(arr){
    let answer=arr;
    for(let i = 0; i < arr.length; i++) {
        for(let j = 1; j < arr.length - i; j++) {
            if(arr[j-1] > 0 && arr[j] < 0) {
                [arr[j-1], arr[j]] = [arr[j], arr[j-1]];
            }
        }
    }

    return answer;
}

let arr=[1, 2, 3, -3, -2, 6, 5, 6, -6];
console.log(solution(arr));

/* 해설 풀이 */
function solution2(arr){
    let answer=arr;
    for(let i=0; i<arr.length-1; i++){
        for(let j=0; j<arr.length-i-1; j++){
            if(arr[j]>0 && arr[j+1]<0){
                [arr[j], arr[j+1]]=[arr[j+1], arr[j]];
            }
        }   
    } 
    return answer;
}

let arr2=[1, 2, 3, -3, -2, 6, 5, 6, -6];
console.log(solution2(arr2));