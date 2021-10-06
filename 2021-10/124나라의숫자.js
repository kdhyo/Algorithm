function solution(n) {
    const ten = [4, 1, 2];
    const result = [];
    
    while(n > 0) {
        const num = ten[n % 3];
        result.unshift(num);
        n = parseInt(n / 3);
        
        if(num === 4) {
            n -= 1
        }
    }
    return result.join("");
}