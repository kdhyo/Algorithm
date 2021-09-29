function solution(n) {
    const arr = [...Array(n+1)].map((_, idx) => idx+1);
    let answer = 0;

    for(let i = 2; i <= n; i++) {
        if(arr[i] !== -1) {
            answer++;
            for(let j = i; j <= n; j += i) {
                arr[j] = -1;
            }
        }
    }
    return answer;
}

console.log(solution(10)); // 4