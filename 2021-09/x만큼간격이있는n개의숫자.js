function solution(x, n) {
    const answer = [];
    answer.push(x);
    for(let i = 1, count = x; i < n; i++) {
        answer.push(count += x);
    }
    return answer;
}

function solution2(x, n) {
    const answer = [];
    for(let i = 1; i <= n; i++) {
        answer.push(x * i);
    }
    return answer;
}

console.log(solution(2, 5)); // [2, 4, 6, 8, 10]
console.log(solution(4, 3)); // [4, 8, 12]
console.log(solution(-4, 2)); // [-4, -8]