function solution(genres, plays) {
    const answer = [];
    if(genres.length > 2) {
        const playSum = getPlaySum(genres, plays);
        const maxGenre = getMaxAndSecondGenre(playSum);

        while(maxGenre.length > 0) {
            const key = maxGenre.shift();
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

function getMaxAndSecondGenre(playSum) {
    const result = [];
    const one = getMaxGenre(playSum);
    result.push(one);
    
    delete playSum[one];
    if(Object.keys(playSum).length > 0) { 
        result.push(getMaxGenre(playSum));
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
    const maxIdx = getMaxPlay(genres, plays, key);
    result.push(maxIdx);
    
    const isNext = genres.filter((genre, idx) => {
       return idx !== maxIdx && key === genre
    }).length;
    
    if(isNext && genres.includes(key)) {
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