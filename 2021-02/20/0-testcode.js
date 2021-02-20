function solution(s){
  var answer = false;
  const splits = s.toLowerCase().split("");
  let p = 0;
  let y = 0;
  splits.forEach(data => {
      if(data === "p") {
          p += 1;
      } else if(data === "y"){
          y += 1;
      }
  });
  if(p === y) {
      answer = true;
  }
  return answer;
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log( numPY("pPoooyY") )
console.log( numPY("Pyy") )


// 내가 맘에 들었던 코드
function solution(s){

  return [...s.toLowerCase()].reduce((acc, cur) => {
      if(cur ==='p') return acc + 1;
      else if(cur ==='y') return acc - 1;
      return acc;
  }, 0) ? false : true;
}

// 내가 새로 짠 코드

function solution(s){
  const {p, y} = s.toLowerCase().split("").reduce((acc, data) => {
    if(data === "p")  acc.p++;
    if(data === "y")  acc.y++;
    return acc;
  }, {p: 0, y: 0});

  if(p === y) {
    return true;
  } else {
    return false;
  }
}