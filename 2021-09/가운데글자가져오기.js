function solution(s) {
    const num = s.length/2;
    return s.length % 2 !== 0 ? s.charAt(Math.floor(num)) : s.substring((num)-1, (num)+1);
}