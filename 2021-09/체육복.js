// 뭐가문제지

function solution(n, lost, reserve) {
    lost.sort((a, b) => a - b);
    reserve.sort((a, b) => a - b);

    reserve = reserve.filter(num => {
        if(lost.indexOf(num) !== -1) {
            lost.splice(lost.indexOf(num), 1);
        } else {
            return true;
        }
    });

    const SIZE = lost.length;
    var answer = n - SIZE;
    for(let i = 0; i < SIZE; i++) {
        const num = lost[i];
        if(reserve.indexOf(num+1) !== -1) {
            reserve.splice(reserve.indexOf(num+1), 1);
            answer++;
        } else if(reserve.indexOf(num-1) !== -1) {
            reserve.splice(reserve.indexOf(num-1), 1);
            answer++;
        }
    }
    return answer;
}

console.log(solution(5, [2, 5, 6], [2, 4, 6]));