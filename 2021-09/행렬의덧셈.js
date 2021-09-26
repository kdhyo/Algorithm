function solution(arr1, arr2) {
    var answer = [];
    const I_SIZE = arr1.length;
    const J_SIZE = arr1[0].length;
    for(let i = 0; i < I_SIZE; i++) {
        answer[i] = [];
        for(let j = 0; j < J_SIZE; j++) {
            answer[i].push(arr1[i][j] + arr2[i][j]);
        }
    }
    return answer;
}

console.log(solution([[1, 2], [2,3]], [[3, 4], [5, 6]])); //[[4, 6], [7, 9]]

/* 
    다른사람풀이 배운 코드
    새로 만들지 않고, A에 더한다는 생각을 못했었다.
*/

function solution(A, B) {
    return A.map((a,i) => a.map((b, j) => b + B[i][j]));
}