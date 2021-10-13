/* 내 풀이 */
function getPrimeArr(max) {
    const primeArr = Array.from({length: max + 1}, (v, i) => i < 2 ? -1 : i);
    for(let i = 2; i < Math.floor(Math.sqrt(primeArr.length)); i++) {
        if (primeArr[i] !== -1) {
            for(let j = i * 2; j < primeArr.length; j = j + i) {
                primeArr[j] = -1;
            }
        }
    }
    return primeArr;
}

function solution(arr) {
    const answer = [];
    for(let num of arr) {
        let sum = 0;
        while(num) {
            sum = sum * 10 + (num % 10);
            num = Math.floor(num / 10);
        }
        answer.push(sum);
    }

    const primeArr = getPrimeArr(Math.max(...answer));

    return answer.filter(num => primeArr[num] !== -1);
}

/* 내 풀이2 */
// function isPrime(num) {
//     if(num <= 1) return false;
//     for(let i = 2; i <= parseInt(Math.sqrt(num)); i++) {
//         if(num % i=== 0) return false;
//     }
//     return true;
// }

// function solution(arr) {
//     const answer = [];
//     for(let x of arr) {
//         const num = Number(x.tonuming().split("").reverse().join(""));
//         console.log(num);
//         if(isPrime(num)) {
//             answer.push(num);
//         }
//     }

//     return answer;
// }



/* 해설 풀이 */
// function isPrime(num){
//     if(num===1) return false;
//     for(let i=2; i<=parseInt(Math.sqrt(num)); i++){
//         if(num%i===0) return false;
//     }
//     return true;
// }
// function solution2(arr){
//     let answer=[];
//     for(let x of arr){
//         let res=0;
//         while(x){
//             let t=x%10;
//             res=res*10+t;
//             x=parseInt(x/10);
//         }
//         if(isPrime(res)) answer.push(res);
//     }
//     return answer;
// }

let arr=[32, 55, 62, 20, 250, 370, 200, 30, 100];
console.log(solution(arr));