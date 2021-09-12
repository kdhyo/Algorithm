function solution(citations) {
    let result = 0;
    citations.sort((a,b) => b-a);
    for(let i = 1; i <= citations.length; i++) {
        if(i <= citations[i-1]) result = i;
        else break;
    }
    
    return result;
}