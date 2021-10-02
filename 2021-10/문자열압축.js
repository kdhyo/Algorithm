function solution(s) {
    const SIZE = Math.floor(s.length / 2);
    const result = [];
    for(let i = 1; i <= SIZE; i++) {
        const arr = [];
        for(let j = i, preJ = 0; preJ <= s.length; j = j + i) {
            arr.push(s.substring(preJ, j));
            preJ = j;
        }
        
        let isPush = false;
        const joinStr = arr.reduce((acc, cur) => {
            const lastStr = acc.pop();
            if(lastStr === cur) {
                isPush = true;
                const numCheck = acc.pop();
                if(isNaN(numCheck)) {
                    if(numCheck !== undefined) acc.push(numCheck);
                    acc.push(2);
                } else {
                    acc.push(numCheck + 1);
                }
                acc.push(lastStr);
            } else {
                if(lastStr !== undefined) acc.push(lastStr);
                acc.push(cur);
            }
            return acc;
        }, []).join("");
        if(isPush) {
            result.push(joinStr.length);
        }
    }
    const min = Math.min(...result);
    return min === 	Infinity ? s.length : min;
}

console.log(solution("abcabcdede"));