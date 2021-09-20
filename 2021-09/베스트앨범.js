function solution(genres, plays) {
    const answer = [];
    if(genres.length > 2) {
        const playSum = getPlaySum(genres, plays);
        const genreSort = getGenreSortByMaxPlay(playSum);
        
        while(genreSort.length > 0) {
            const key = genreSort.shift();
            answer.push(  ...getMaxPlays(genres, plays, key) );
        }
    } else {
        if(genres.length === 1) {
            return [0];
        } else {
            return plays[0] >= plays[1] ? [0, 1] : [1, 0];
        }
    }

    return answer;
}

function getPlaySum(genres, plays) {
    return genres.reduce((acc, cur, idx) => {
        if(acc[cur] === undefined) {
            acc[cur] = plays[idx];
        } else {
            acc[cur] = acc[cur] + plays[idx];
        }
        return acc;
    }, {});
}

function getGenreSortByMaxPlay(playSum) {
    const result = [];
    while(Object.keys(playSum).length > 0) {
        const max = getMaxGenre(playSum);
        result.push(max);
        delete playSum[max];
    }
    
    return result;
}

function getMaxGenre(playSum) {
    let maxKey = "";
    let maxVal = 0;
    for (const [key, value] of Object.entries(playSum)) {
      if(maxVal < value) {
          maxKey = key;
          maxVal = value;
      }
    }
    return maxKey;
}

function getMaxPlays(genres, plays, key) {
    const result = [];
    const maxIdx = getMaxPlay(genres, plays, key, null);
    result.push(maxIdx);
    
    const isNextLength = genres.filter((genre, idx) => {
       return idx !== maxIdx && key === genre
    }).length;
    
    if(isNextLength > 0 && genres.includes(key)) {
        result.push(getMaxPlay(genres, plays, key, maxIdx));
    }
    
    return result;
}

function getMaxPlay(genres, plays, key, notIdx) {
    let maxPlay = 0;
    let maxIdx = 0;
    
    genres.forEach((genre, idx) => {
        if(genre === key && maxPlay < plays[idx] && notIdx !== idx) {
            maxPlay = plays[idx];
            maxIdx = idx;
        }
    });
    return maxIdx;
}

console.log(solution(["classic", "pop", "classic", "classic", "pop"], [500, 600, 150, 800, 2500]));
console.log(solution(["classic", "pop", "classic", "classic", "classic"], [500, 1000, 400, 300, 200, 100]));
console.log(solution(["A", "A", "B", "A", "B", "B", "A", "A", "A", "A"], [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]));
console.log(solution(["A", "A", "A", "A", "B", "A"], [100, 300, 100, 500, 5000, 100]));
console.log(solution(["A", "A", "A", "A", "A"], [100, 300, 100, 500, 100]));
console.log(solution(["A", "C", "B", "B", "A", "C", "C", "A", "D"], [100, 200, 100, 200, 300, 400, 100, 500, 5000]));
