/* 내 풀이 */
function solution(s, t) {
    s = s.split("");
    const answer = [];
    const arr = [];

    for(let i = 0; i < s.length; i++) {
        if(s[i] === t) arr.push(i);
    }

    for(let i = 0; i < s.length; i++) {
        const lengthArr = [];
        for(let j = 0; j < arr.length; j++) {
            lengthArr.push(Math.abs(arr[j] - i));
        }
        answer.push(Math.min(...lengthArr));
    }
    return answer;
}

/* 해설 풀이 */
function solution2(s, t){
    let answer=[];
    let p=1000;
    for(let x of s){
        if(x===t){
            p=0;
            answer.push(p);
        }
        else{
            p++;
            answer.push(p);
        }
    }
    p=1000;
    for(let i=s.length-1; i>=0; i--){
        if(s[i]===t) p=0;
        else{
            p++;
            answer[i]=Math.min(answer[i], p);
        }
    }
    return answer;
}

let str="g0en2T0s8eSoft";
console.log(solution('teachermode', 'e'));