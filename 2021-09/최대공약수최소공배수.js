function solution(n, m) {
    const gcd = getGreatestCommonFactor(n, m);
    return [gcd, getLeastCommonMultiple(n, m, gcd)];
}

function getGreatestCommonFactor(n, m) {
    const remainder = Math.floor(m % n);
    return remainder === 0 ? n : getGreatestCommonFactor(remainder, n);
}

function getLeastCommonMultiple(n, m, gcd) {
    return (n * m) / gcd;
}

console.log(solution(2, 5));