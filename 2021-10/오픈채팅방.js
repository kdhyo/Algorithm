function solution(record) {
    const notChangedArr = record.filter(str => /^(?!Change)/.test(str));
    const result = {};
    
    record.forEach(message => {
        const [status, id, name] = message.split(" ");
        if(status === 'Enter' || status === 'Change') {
            result[id] = name;
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