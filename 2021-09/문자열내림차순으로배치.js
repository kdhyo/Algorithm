function solution(s) {
    return s
        .split("")
        .map(str => str.charCodeAt(0))
        .sort((a, b) => b- a)
        .map(num => String.fromCharCode(num))
        .join("");
}

console.log(solution("Zbcdefg")); // "gfedcbZ"