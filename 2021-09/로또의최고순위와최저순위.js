function solution(lottos, win_nums) {
    let zeroCount = 0, max_num = 0;
    const minArr = [6, 6, 5, 4, 3, 2, 1];
    lottos.forEach(lotto => {
        if(lotto === 0) {
            zeroCount++;
        } else if(win_nums.includes(lotto)) {
            max_num++;
        }
    });
    
    return [ minArr[max_num + zeroCount], minArr[max_num] ];
}

console.log(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])); // [3, 5]