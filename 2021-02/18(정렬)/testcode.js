function solution(array, commands) {
  var answer = [];
  
  commands.forEach(data => {
      let val = array.slice(data[0]-1, data[1]).sort((a,b) => a-b);
      answer.push(val[data[2]-1]);
  })
  return answer;
}

const array = [1,5,2,6,3,7,4];
const commands = [[2,5,3], [4,4,1], [1,7,3]];

console.log(solution(array, commands)); //기대값 [5, 6, 3]