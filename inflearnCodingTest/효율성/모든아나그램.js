/* 내 풀이 */
function solution(s, t) {
    let answer = 0;
    const SIZE = s.length - t.length;
    const T_SIZE = t.length;

    for(let i = 0; i <= SIZE; i++) {
        const str = s.substr(i, T_SIZE);
        let flag = true;
        for(let x of t) {
            if(!str.includes(x)) {
                flag = false;
                break;
            }
        }
        if(flag) answer++;
    }
    return answer;
}

let a="bacaAacba";
let b="abc";
console.log(solution(a, b));
/* 해설 풀이 */
function compareMaps(map1, map2){
    if(map1.size!==map2.size) return false;
    for(let [key, val] of map1){
        if(!map2.has(key) || map2.get(key)!==val) return false;
    }
    return true;
}
function solution2(s, t){
    let answer=0;
    let tH = new Map();
    let sH = new Map();
    for(let x of t){
        if(tH.has(x)) tH.set(x, tH.get(x)+1);
        else tH.set(x, 1);
    }
    let len=t.length-1;
    for(let i=0; i<len; i++){
        if(sH.has(s[i])) sH.set(s[i], sH.get(s[i])+1);
        else sH.set(s[i], 1);
    }
    let lt=0;
    for(let rt=len; rt<s.length; rt++){
        if(sH.has(s[rt])) sH.set(s[rt], sH.get(s[rt])+1);
        else sH.set(s[rt], 1);
        if(compareMaps(sH, tH)) answer++;
        sH.set(s[lt], sH.get(s[lt])-1);
        if(sH.get(s[lt])===0) sH.delete(s[lt]);
        lt++;
    }
    return answer;
}

let a2="bacaAacba";
let b2="abc";
console.log(solution2(a2, b2));