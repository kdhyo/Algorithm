/* 내 풀이 */
function solution(m, product){
    let answer=0;
    const SIZE = product.length;
    product = product.sort((a, b) => a.reduce((acc, cur) => acc+cur) - b.reduce((acc, cur) => acc+cur));

    for(let i = 0; i < SIZE; i++) {
        let sum = 0, count = 0;
        for(let j = 0; j < SIZE; j++) {
            const num = j === i ? parseInt(product[j][0] / 2) + product[j][1] : product[j][0] + product[j][1];
            sum += num;

            if(sum > m) {
                sum -= num;
                continue;
            }
            count++;
        }
        if(answer < count) {
            answer = count;
        }
    }

    return answer;
}

/* 해설 풀이 */
function solution2(m, product){
    let answer=0;
    let n=product.length;
    product.sort((a, b)=>(a[0]+a[1])-(b[0]+b[1]));
    for(let i=0; i<n; i++){
        let money=m-(product[i][0]/2+product[i][1]);
        let cnt=1;
        for(let j=0; j<n; j++){
            if(j!==i && (product[j][0]+product[j][1])>money) break;
            if(j!==i && (product[j][0]+product[j][1])<=money){
                money-=(product[j][0]+product[j][1]);
                cnt++;
            }
        }
        answer=Math.max(answer, cnt);
    }  
    return answer;
}

let arr=[[6, 6], [2, 2], [4, 3], [4, 5], [10, 3]];
console.log(solution(28, arr));