function solution(new_id) {
    let answer = new_id.toLowerCase() // 1단계
    .replace(/[~!@#$%^&*()=+\[{\]}:?,<>\/]/g, "") // 2단계
    .replace(/[.]{2,}/g, ".") // 3단계
    .replace(/^\.|\.$/g, "") // 4단계
    .substring(0, 15) // 6단계
    .replace(/^\.|\.$/g, ""); // 6단계
    
    if(answer === "" || answer === null || answer === undefined) answer = "a" // 5단계
    while(answer.length < 3) answer += answer.charAt(answer.length-1); // 7단계
    
    return answer;
}

console.log(solution("~!@#$%&*()=+[{]}:?,<>/"));