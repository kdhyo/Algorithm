// 내 스스로 못푼 문제

function solution(numbers) {
    const answer = numbers.map(c=> c + '').
    				sort((a,b) => (b+a) - (a+b)).join('');
    
    return answer[0] === '0'? '0' : answer;
}