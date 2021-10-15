/* 내 풀이 */
function solution(k, arr){
    let answer = 0;
    const SIZE = arr.length - k;

    for(let i = 0; i <= SIZE; i++) {
        let sum = 0;
        for(let j = i; j < i + k; j++) {
            sum += arr[j];
        }
        if(answer < sum) answer = sum;
    }
    return answer;
}

let a=[12, 15, 11, 20, 25, 10, 20, 19, 13, 15];
console.log(solution(3, a));

/* 해설 풀이 */
function solution2(k, arr){
    let answer, sum=0;
    for(let i=0; i<k; i++) sum+=arr[i];
    answer=sum;
    for(let i=k; i<arr.length; i++){
        sum+=(arr[i]-arr[i-k]);
        answer=Math.max(answer, sum);
    }                    
    return answer;
}

let b=[12, 15, 11, 20, 25, 10, 20, 19, 13, 15];
console.log(solution2(3, b));