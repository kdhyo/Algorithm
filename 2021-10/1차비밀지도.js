function solution(n, arr1, arr2) {
    const answer = [];
    for(let i = 0; i < n; i++) {
        const arr1ToString = arr1[i].toString(2).padStart(n, '0');
        const arr2ToString = arr2[i].toString(2).padStart(n, '0');
        const str = arr1ToString
            .split("")
            .map((num, idx) => isOne(num, arr2ToString.charAt(idx)) ? "#" : " ")
            .join("");
        answer.push(str);
    }
    
    return answer;
}

function isOne(num1, num2) {
    return +num1 === 1 || +num2 === 1;
}

/*
n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]
*/

// 다른사람 풀이보고 변경한 코드
// 비트연산이랑 replace를 생각하게 됐다.
function solution(n, arr1, arr2) {
    const answer = [];
    return arr1.map((num, idx) => (num | arr2[idx])
             .toString(2).padStart(n, '0')
             .replace(/1/g, "#")
             .replace(/0/g, " "));
}