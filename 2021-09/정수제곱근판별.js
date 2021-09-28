function solution(n) {
    const x = Math.sqrt(n);
    return x % 1 === 0 ? (x+1) * (x+1) : -1;
}

console.log(121); //144
console.log(3); // -1