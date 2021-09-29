function solution(arr, divisor) {
    const answer = [];
    arr.forEach(num => {
       if(num % divisor === 0) answer.push(+num); 
    });
    return answer.length === 0 ? [-1] : answer.sort((a, b) => a-b);
}

console.log(solution([5, 9, 7, 10], 5)); // [5, 10]

/* 다른사람 풀이 배운 코드 적용 */

function solution2(arr, divisor) {
    var answer = arr.filter(v => v%divisor == 0);
    return answer.length == 0 ? [-1] : answer.sort((a,b) => a-b);
}