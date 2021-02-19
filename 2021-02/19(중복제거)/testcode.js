function solution(arr)
{
    const answer = [];
    arr.forEach((data, idx) => {
        if(idx === 0) {
            answer.push(data);
        } else {
            if(answer[answer.length - 1] !== data) {
                answer.push(data);
            }
        }
    });
    return answer;
}

// 보고 감탄한 코드
// 나는 계속 넣은 뒤에 코드랑만 비교할 생각만 했었는데, 이렇게 앞에 코드랑 비교를 해서 넣을 수도 있다는
// 것을 알게 되었다.

function solution(arr)
{
    return arr.filter((val,index) => val != arr[index+1]);
}