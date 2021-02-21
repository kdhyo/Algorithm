// 스스로 풀기에 실패하여
// 다른 사람들이 작성한 코드를 보고 참고
// 근데 다들 공식을 어떻게 찾아내는거지..?

function solution(clothes) {
  return Object.values(clothes.reduce((obj, t)=> {
      obj[t[1]] = obj[t[1]] ? obj[t[1]] + 1 : 1;
      return obj;
  } , {})).reduce((a,b)=> a*(b+1), 1)-1;    
}

function solution(clothes) {
  let answer = 1;
  const obj = {};
  for(let arr of clothes) {
      obj[arr[1]] = (obj[arr[1]] || 0) + 1;
  }

  for(let key in obj) {
      answer *= (obj[key]+1);
  }

  return answer - 1;
}