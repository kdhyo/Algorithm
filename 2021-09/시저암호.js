function solution(s, n) {
    return s.split("")
    .map(a => {
        if(a === " ") return " ";
        const code = a.charCodeAt(0) + n;
        if(a === a.toUpperCase()) {
            return code > 90 ? String.fromCharCode(64 + (code - 90)) : String.fromCharCode(code);
        } else {
            return code > 122 ? String.fromCharCode(96 + (code - 122)) : String.fromCharCode(code);
        }
    })
    .join("");
}

console.log(solution("AB", 1)); // "BC"
console.log(solution("z", 1)); // "a"
console.log(solution("a B z", 4)); // "e F d"