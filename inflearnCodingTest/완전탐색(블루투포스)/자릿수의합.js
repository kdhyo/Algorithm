/* 내 풀이 */
function solution(size, arr) {
    let max = 0;
    let idx = 0;

    for(let i = 0; i < size; i++) {
        let num = arr[i];
        let sum = 0;
        while(num) {
            sum += (num % 10);
            num = Math.floor(num / 10);
        }
        if(sum > max) {
            max = sum;
            idx = i;
        }
        else if(sum === max && arr[idx] < arr[i]) {
            max = sum;
            idx = i;
        }
    }
    return arr[idx];
}

/* 해설 풀이 */
function solution2(n, arr){
    let answer, max=Number.MIN_SAFE_INTEGER;
    for(let x of arr){
        let sum=0, tmp=x;
        while(tmp){
            sum+=(tmp%10);
            tmp=Math.floor(tmp/10);
        }
        if(sum>max){
            max=sum;
            answer=x;
        }
        else if(sum===max){
            if(x>answer) answer=x;
        }
    }
    return answer;
}

let arr=[128, 460, 603, 40, 521, 137, 123];
console.log(solution(7, arr));