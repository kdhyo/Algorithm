/* 내 풀이 */
function solution(n) {

    function DFS(L) {
        if (L == 0) return;
        else {
            DFS(L - 1);
            console.log(L);
        }
    }

    DFS(n);
}

/* 해설 풀이 */
function solution2(n){
    let answer=0;
    for(let i=1; i<=n; i++){
        answer=answer+i;
    }
    
    return answer;
}

console.log(solution(10));