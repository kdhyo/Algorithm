function solution(n, lost, reserve) {
    lost.sort((a, b) => a - b);

    reserve = reserve.filter(num => {
        if(lost.indexOf(num) !== -1) {
            lost.splice(lost.indexOf(num), 1);
        } else {
            return true;
        }
    });

    const SIZE = lost.length;
    let answer = n - SIZE;
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

// 다른방안으로 해결
// 위에껀 왜 안되는걸까

function solution2(n, lost, reserve) {
    const result = new Array(n + 1).fill(1);
    let answer = n;
    
    for(let i of reserve) result[i]++;
    for(let i of lost) result[i]--;
    
    lost = lost.sort((a, b) => a - b);
    
    for(let i = 0; i < lost.length; i++) {
        const lost_num = lost[i];
        if(result[lost_num] === 1) continue;
        
        if(lost_num > 1 && result[lost_num - 1] === 2) {
            result[lost_num - 1] = result[lost_num - 1] - 1;
        } else if(lost_num < n && result[lost_num + 1] === 2) {
            result[lost_num + 1] = result[lost_num + 1] - 1;
        } else {
            answer--;
        }
    }
    return answer;
}