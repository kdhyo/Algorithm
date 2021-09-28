function solution(n) {
    let answer = 0;
    for(let i = 1; i <= n; i++) {
        answer = n % i === 0 ? answer + i : answer;
    }
    return answer;
}

console.log(12); // 28
console.log(5); // 6