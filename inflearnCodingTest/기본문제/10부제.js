/* 내 풀이 */
function solution(day, arr){
    return arr.filter(num => num % 10 === day).length;
}

/* 해설 풀이 */
function solution2(day, arr){
    let answer=0;
    for(let x of arr){
        if(x%10==day) answer++;
    }
    
    return answer;
}

arr=[25, 23, 11, 47, 53, 17, 33];
console.log(solution(3, arr));