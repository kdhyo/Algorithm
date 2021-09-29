function solution(s) {
    return (s.length === 4 || s.length === 6) &&  !/[a-zA-Z]/.test(s) ? true : false;
}

console.log("a123") // false
