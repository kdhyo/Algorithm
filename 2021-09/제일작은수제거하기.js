function solution(arr) {
    const MIN = Math.min( ...arr);
    const answer = arr.filter(num => num > MIN);
    return answer.length === 0 ? [-1] : answer;
}

console.log([4,3,2,1]) // [4,3,2]
console.log([10]) // [-1]