/* 내 풀이 */
function solution(m, arr){
    let answer = 0;
    const SIZE = arr.length;

    for(let i = 0; i < SIZE; i++) {
        let sum = 0;

        for(let j = i; j < SIZE; j++) {
            sum += arr[j];

            if(sum === m) {
                answer++;
                break;
            }
            if(sum > m) break;
        }
    }
    return answer;
}

let a=[1, 2, 1, 3, 1, 1, 1, 2];
console.log(solution(6, a));


/* 해설 풀이 */

function solution2(m, arr){
    let answer=0, lt=0, sum=0;
    for(let rt=0; rt<arr.length; rt++){
        sum+=arr[rt];
        if(sum===m) answer++;
        while(sum>=m){
            sum-=arr[lt++];
            if(sum===m) answer++;       
        }
    }        
    return answer;
}

let b=[1, 2, 1, 3, 1, 1, 1, 2];
console.log(solution2(6, b));
