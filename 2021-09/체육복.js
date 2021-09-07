// 뭐가문제지
// https://velog.io/@grappe96/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B3%A0%EB%93%9D%EC%A0%90-Kit-%EC%B2%B4%EC%9C%A1%EB%B3%B5-%EB%AC%B8%EC%A0%9C-%ED%92%80%EC%9D%B4-JS
// 위 코드함봐야지

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