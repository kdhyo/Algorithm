/* 내 풀이 */
function solution(arr) {
    const SIZE = arr.length;
    let maxRow = 0
    , maxCol = 0
    , maxDia = 0
    , maxDia2 = 0;
    for(let i = 0, z = SIZE - 1; i < SIZE; i++, z--) {
        let rowSum = 0;
        let colSum = 0;
        for(let j = 0; j < SIZE; j++) {
            rowSum += arr[i][j];
            colSum += arr[j][i];
        }
        maxDia += arr[i][i];
        maxDia2 += arr[i][z];
        if(maxRow < rowSum) maxRow = rowSum;
        if(maxCol < colSum) maxCol = colSum;
    }

    return Math.max(maxRow, maxCol, maxDia, maxDia2);
}

/* 해설 풀이 */
function solution2(arr){  
    let answer=Number.MIN_SAFE_INTEGER;
    let n=arr.length;
    let sum1=sum2=0;
    for(let i=0; i<n; i++){
        sum1=sum2=0;
        for(let j=0; j<n; j++){
            sum1+=arr[i][j];
            sum2+=arr[j][i];
        }
        answer=Math.max(answer, sum1, sum2);
    }
    sum1=sum2=0;
    for(let i=0; i<n; i++){
        sum1+=arr[i][i];
        sum2+=arr[i][n-i-1];
    }  
    answer=Math.max(answer, sum1, sum2); 
    return answer;
}

let arr=[[10, 13, 10, 12, 15], 
[12, 39, 30, 23, 11],
[11, 25, 50, 53, 15],
[19, 27, 29, 37, 27],
[19, 13, 30, 13, 19]];
console.log(solution(arr));