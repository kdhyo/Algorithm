function solution(n) {
    return [ ...n + ""].reverse().map(str => +str);
}

console.log(12345); // [5, 4, 3, 2, 1]