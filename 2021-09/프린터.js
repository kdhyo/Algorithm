function solution(priorities, location) {
    const answer = [];
    const prioritiesSort = [ ...priorities];
    const maxArr = [ ...prioritiesSort.sort((a,b) => b-a) ];

    for(var i = 0; i < priorities.length; i++) {
        if(priorities[i] === maxArr[0] && answer.indexOf(i) === -1) {
            answer.push(i);
            if(maxArr.length > 1)  maxArr.shift();
        }
        if(priorities[i] === maxArr[0] && location === 0 && i === 0) {
            return answer.length;
        }
        if(answer.length !== priorities.length && i === priorities.length - 1){
            i = -1;
        } 
    }
    return answer.indexOf(location) + 1;
}

console.log(solution([1, 1, 9, 1, 1, 1], 0));