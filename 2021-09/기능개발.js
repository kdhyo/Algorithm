// 왜 한번에 됐지..?

function solution(progresses, speeds) {
    var answer = [1];
    const arr = [];
    
    for(let i = 0; i < progresses.length; i++) {
        let count = 0;
        for(let j = progresses[i]; j < 100; j+=speeds[i]) count++;
        arr.push(count);
    }
    
    let arr_count = 0;
    let maxNum = arr[0];
    for(let i = 1; i < arr.length; i++) {
        if(arr[i] <= maxNum) {
            answer[arr_count]++;
        } else {
            maxNum = arr[i];
            answer[++arr_count] = 1;
        }
    }
    
    return answer;
}

// 다른사람 풀이보고 Math.ceil 과 for문에 i말고 count 넣는 것이 더 가독성이 좋아보여서 따라해본 풀이
function solution2(progresses, speeds) {
    var answer = [1];
    const days = progresses.map((progress, index) => Math.ceil((100 - progress) / speeds[index]));
    
    let maxDay = days[0];
    for(let i = 1, arr_count = 0; i < days.length; i++) {
        if(days[i] <= maxDay) {
            answer[arr_count]++;
        } else {
            maxDay = days[i];
            answer[++arr_count] = 1;
        }
    }
    
    return answer;
}