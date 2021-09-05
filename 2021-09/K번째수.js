function solution(array, commands) {
    var answer = [];
    
    commands.forEach(data => {
        const [i, j, k] = data;
        const sortArr = array.slice(i-1, j).sort((a, b) => a - b);
        answer.push(sortArr[k-1]);
    });
    return answer;
}