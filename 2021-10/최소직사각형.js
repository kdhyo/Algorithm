function solution(sizes) {
    return sizes.map(arr => arr.sort((a, b) => b - a))
        .reduce((acc, cur) => [Math.max(acc[0], cur[0]), Math.max(acc[1], cur[1])])
        .reduce((acc, cur) => acc * cur);
}