function solution(n) {
    return "수".repeat(n).split("").map((str, idx) => idx % 2 ? "박" : str).join("");
}

console.log(solution(3)); // "수박수"