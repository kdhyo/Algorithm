/* 내 풀이 */
// 문제를 잘못 이해해서 문제 지문 자체를 이해하지 못하고, 해설을 듣고 이해한 후 코드 작성
function solution(arr){
    let answer=0;
    let m = arr.length;
    let n = arr[0].length;
    for(let i = 1; i <= n; i++) {
        for(let j =1; j <= n; j++) {
            if(i === j) continue;
            let flag = true;
            for(let k = 0; k < m; k++) {
                if(arr[k].indexOf(i) > arr[k].indexOf(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
    }

    return answer;
}



/* 해설 풀이 */
function solution2(test){
    let answer=0;
    m=test.length;
    n=test[0].length;
    for(let i=1; i<=n; i++){
        for(let j=1; j<=n; j++){
            let cnt=0;
            for(let k=0; k<m; k++){
                let pi=pj=0;
                for(let s=0; s<n; s++){
                    if(test[k][s]===i) pi=s;
                    if(test[k][s]===j) pj=s;
                }
                if(pi<pj) cnt++;
            }
            if(cnt===m) answer++;
        }
    }
    return answer;
}


let arr=[[3, 4, 1, 2], [4, 3, 2, 1], [3, 1, 4, 2]];
console.log(solution(arr));