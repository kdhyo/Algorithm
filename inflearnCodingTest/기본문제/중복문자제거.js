/* 내 풀이 */
function solution(s){  
    return [...new Set(s.split(""))].join("");
}


/* 해설 풀이 */
function solution2(s){  
    let answer="";
    //console.log(s.indexOf("K"));
    for(let i=0; i<s.length; i++){
        //console.log(s[i], i, s.indexOf(s[i]));
        if(s.indexOf(s[i])===i) answer+=s[i];
    }
    return answer;
}

console.log(solution("ksekkset"));