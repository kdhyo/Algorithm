function solution(s) {
    const numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    const result = [];
    let check = [];
    
    for(let i = 0; i < 10; i++) {
        while(s.match(numbers[i])) {
            s = s.replace(numbers[i], i);
        }
    }
    return +s;
}