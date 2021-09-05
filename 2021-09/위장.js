function solution(clothes) {
    let answer = 1;
    const CLOTHES_SIZE = clothes.length;
    const map = {};
    
    for(let i = 0; i < CLOTHES_SIZE; i++) {
        const key = clothes[i][1];
        map[key] = map[key] ? map[key] + 1 : 1;
    }
    const arr = Object.values(map);
    const ARR_SIZE = arr.length;
    for(let i = 0; i < ARR_SIZE; i++) {
        answer *= arr[i] + 1;
    }
    
    return answer - 1;
}