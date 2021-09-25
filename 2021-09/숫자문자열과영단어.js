function solution(s) {
    const numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];

    for(let i = 0; i < 10; i++) {
        while(s.match(numbers[i])) {
            s = s.replace(numbers[i], i);
        }
    }

    return +s;
}

console.log(solution("one4seveneight")); //1478
console.log(solution("23four5six7")); //234567
console.log(solution("2three45sixseven")); //234567
console.log(solution("123")); //123
