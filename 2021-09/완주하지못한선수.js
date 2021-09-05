// 1차 작성 코드

function solution(participant, completion) {
    var answer = '';
    const nameCount = participant.reduce((acc, cur) => {
       acc[cur] = acc[cur] === undefined ? 1 : acc[cur] + 1;
        return acc;
    }, {});
    completion.forEach(name => {
        nameCount[name] = nameCount[name] - 1;
        if(nameCount[name] === 0) delete nameCount[name];
    });
    for (const [key, value] of Object.entries(nameCount)) {
        answer = value > 0 && key;
    }

    return answer;
}