function solution(x) {
  let sum = 0;
  const arr = x.toString().split("").map(Number);
  for(let i = 0; i < arr.length; sum += arr[i++]);
  if(x % sum === 0) return true;
  return false;
}

// 내가 마음에 들었던 코드
// 나랑 비슷한 방식인데 난 map을 통해 형변환을 한번 해주고, for를 돌렸기 떄문에
// 두 번 돌았다. 하지만 아래 예제에서는 for를 통해 형변환을 해주기 때문에 for를 한 번 썼고,
// return을 삼항으로 한 게 마음에 들었따.

function Harshad(n){
  var result ;
  var sum = 0;
  var arr = String(n).split('');
  for(var i=0; i<arr.length; i++) {
    sum += Number(arr[i]);
  }
  return n % sum == 0 ? true : false;
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log(Harshad(18))
console.log(Harshad(13))

