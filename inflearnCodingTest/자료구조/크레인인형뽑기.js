/* 내 풀이 */
function solution(board, moves){
    let answer=0;
    const stack = [];
    const SIZE = board.length;
    moves.forEach(move => {
        for(let i = 0; i < SIZE; i++) {
            const tmp = board[i][move - 1];
            if(tmp !== 0) {
                if(stack.length > 0 && stack[stack.length - 1] === tmp) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(tmp);
                }
                board[i][move - 1] = 0;
                break;
            }
        }
    });
    
    return answer;
}

let a=[[0,0,0,0,0],
       [0,0,1,0,3],
       [0,2,5,0,1],
       [4,2,4,4,2],
       [3,5,1,3,1]];

let b=[1, 5, 3, 5, 1, 2, 1, 4];
console.log(solution(a, b));

/* 해설 풀이 */
function solution2(board, moves){
    let answer=0;
    let stack=[];
    moves.forEach(pos => {
        for(let i=0; i<board.length; i++){
            if(board[i][pos-1]!==0){
                let tmp=board[i][pos-1];
                board[i][pos-1]=0;
                if(tmp===stack[stack.length-1]){
                    stack.pop();
                    answer+=2;
                }
                else stack.push(tmp);
                break;
            }
        }
    });
                    
    return answer;
}

let a2=[[0,0,0,0,0],
       [0,0,1,0,3],
       [0,2,5,0,1],
       [4,2,4,4,2],
       [3,5,1,3,1]];

let b2=[1, 5, 3, 5, 1, 2, 1, 4];
console.log(solution2(a2, b2));