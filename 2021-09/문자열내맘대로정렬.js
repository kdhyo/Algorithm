function solution(strings, n) {
    return strings
        .sort((a, b) => {
        if(a.charAt(n) < b.charAt(n)) return -1;
        if(a.charAt(n) > b.charAt(n)) return 1;
        if(a < b) return -1;
        if(a > b) return 1;
        return 0;
        //a.charAt(n) < b.charAt(n) ? -1 : a.charAt(n) > b.charAt(n) ? 1 : a < b ? -1 : a > b ? 1 : 0
    });
}

console.log(solution(["sun", "bed", "car"], 1)); // ["car", "bed", "sun"]