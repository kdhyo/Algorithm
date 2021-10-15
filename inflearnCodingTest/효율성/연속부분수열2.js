/* 내 풀이 */
function solution(m, arr){
    let answer=0;
    const SIZE = arr.length;
    for(let i = 0; i < SIZE; i++) {
        let sum = 0;
        for(let j = i; j < SIZE; j++) {
            sum += arr[j];
            if(sum <= m) answer++;
            if(sum > m) break;
        }
    }
    return answer;
}

let a=[1, 3, 1, 2, 3];
console.log(solution(5, a));


/* 해설 풀이 */
function solution2(m, arr){
    let answer=0, sum=0, lt=0;
    for(let rt=0; rt<arr.length; rt++){
        sum+=arr[rt];
        while(sum>m){
            sum-=arr[lt++];
        }
        answer+=(rt-lt+1);
    }               
    return answer;
}

let b=[1, 3, 1, 2, 3];
console.log(solution2(5, b));