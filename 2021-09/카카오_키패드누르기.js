function solution(numbers, hand) {
    const arr2 = [
        [0, 4, 3, 4, 3, 2, 3, 2, 1, 2]
         , [4, 0, 1, 2, 1, 2, 3, 2, 3, 4]
         , [3, 1, 0, 1, 2, 1, 2, 3, 2, 3]
         , [4, 2, 1, 0, 3, 2, 1, 4, 3, 2]
         , [3, 1, 2, 3, 0, 1, 2, 1, 2, 3]
         , [2, 2, 1, 2, 1, 0, 1, 2, 1, 2]
         , [3, 3, 2, 1, 2, 1, 0, 3, 2, 1]
         , [2, 2, 3, 4, 1, 2, 3, 0, 1, 2]
         , [1, 3, 2, 3, 2, 1, 2, 1, 0, 1]
         , [2, 4, 3, 2, 3, 2, 1, 2, 1, 0]
         , [1, 3, 4, 5, 2, 3, 4, 1, 2, 3]
         , [1, 5, 4, 3, 4, 3, 2, 3, 2, 1]
    ];

    const leftArr = [1, 4, 7],
          rightArr = [3, 6, 9];
    
    const hands = {
        left : 10,
        right : 11
    };

    return numbers.map(number => {
       if(leftArr.includes(number)) {
           hands.left = number;
           return "L";
       } else if(rightArr.includes(number)) {
           hands.right = number;
           return "R";
       } else if(arr2[hands.left][number] > arr2[hands.right][number]) {
           hands.right = number;
           return "R";
       } else if(arr2[hands.left][number] < arr2[hands.right][number]) {
           hands.left = number;
           return "L";
       }  else if(arr2[hands.left][number] === arr2[hands.right][number]) {
           hands[hand] = number;
           return hand === "left" ? "L" : "R";
       }
    }).join("");
}

console.log(solution([7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], "left"));