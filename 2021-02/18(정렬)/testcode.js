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


// 다른 사람이 작성한 내가 마음에 들었던 코드
// [sPosition, ePosition, position] = command 이 부분이 직관적이어서 가장 마음에 들었다.
function solution(array, commands) {
  return commands.map(command => {
      const [sPosition, ePosition, position] = command
      const newArray = array
          .filter((value, fIndex) => fIndex >= sPosition - 1 && fIndex <= ePosition - 1)
          .sort((a,b) => a - b)    

      return newArray[position - 1]
  })
}