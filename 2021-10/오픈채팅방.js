function solution(record) {
    const notChangedArr = record.filter(str => /^(?!Change)/.test(str));
    const result = {};
    
    record.forEach(message => {
        const splitArr = message.split(" ");
        if(splitArr[0] === 'Enter' || splitArr[0] === 'Change') {
            result[splitArr[1]] = splitArr[2];
        }
    });

    return notChangedArr.map(message => {
        const splitArr = message.split(" ");
        return changedMessage(splitArr[0], result[splitArr[1]]);
    });
}

function changedMessage(order, name) {
    if(order === 'Enter') {
        return `${name}님이 들어왔습니다.`;
    } else if(order === 'Leave') {
        return `${name}님이 나갔습니다.`;
    }
}