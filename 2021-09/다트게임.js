function solution(dartResult) {
    const arr = dartResult.match(/\d+[SDT]{1}[*#]?/g);
    const nums = [];
    arr.forEach(str => {
        const reg = /(\d+)([SDT]{1})([*#]?)/g.exec(str);
        let num = +reg[1];
        num = reg[2] === "D" ? num * num : reg[2] === "T" ? num * num * num : num;
        
        if(reg[3] !== '') {
            if(reg[3] === "*") {
                const pop = nums.pop();
                if(pop) nums.push(pop*2);
                nums.push(num*2);
            } else {
                nums.push(-num);
            }
        } else {
            nums.push(num);
        }
    });
    return nums.reduce((acc, cur) => acc += cur, 0);
}

console.log(solution("1D2S#10S")); // 9