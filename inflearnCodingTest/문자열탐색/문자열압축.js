/* 내 풀이 */
function solution(s){
    let answer=""
    , count = 0
    , a = s.charAt(0);
    s += " ";
    for(let x of s) {
        if(x !== a) {
            answer += `${a}`;
            if(count > 1) answer += `${count}`;
            count = 1;
            a = x;
        } else {
            count++;
        }
    }

    return answer;
}

/* 해설 풀이 */
function solution2(s){
    let answer="";
    let cnt=1;
    s=s+" ";
    for(let i=0; i<s.length-1; i++){
        if(s[i]===s[i+1]) cnt++;
        else{
            answer+=s[i];
            if(cnt>1) answer+=String(cnt);
            cnt=1;
        }
    }
    return answer;
}

let str="KKHSSSSSSSE";
console.log(solution(str));