function solution(answers) {
    var answer = [];
    const ONE = [1, 2, 3, 4, 5];
    const TWO = [2, 1, 2, 3, 2, 4, 2, 5];
    const THREE = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    const [ONE_SIZE, TWO_SIZE, THREE_SIZE] = [ONE.length, TWO.length, THREE.length];
    
    let oneCount = 0;
    let twoCount = 0;
    let threeCount = 0;
    
    answers.forEach((num, idx) => {
        if(num === ONE[idx % ONE_SIZE]) oneCount++;
        if(num === TWO[idx % TWO_SIZE]) twoCount++;
        if(num === THREE[idx % THREE_SIZE]) threeCount++;
    });
    
    const MAX = Math.max(oneCount, twoCount, threeCount);
    if(oneCount === MAX) answer.push(1);
    if(twoCount === MAX) answer.push(2);
    if(threeCount === MAX) answer.push(3);
    
    return answer;
}