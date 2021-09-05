// 길이(i or n) 0 1 2 3 ~ 10
// 가격(Pi) 0 1 5 8 9 10 17 17 20 24 30
// 길이가 4일 시 3+1 / 2+2 / 1+3 / 0+4 로 계산한다.

const p = [0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30];

const cutRod = (p, n) => {
    let r = [0];
    for (let j = 1; j <=n; j++) {
        let q = -1;
        for(let i = 1; i <= j; i++) {
            console.log(`j = ${j} \n i = ${i} \n  계산 = ${p[i] + r[j -i]} \n q = ${q}`);
            q = Math.max(q, p[i] + r[j -i]);
        }
        r[j] = q;
    }
    return r[n];
}


console.log(cutRod(p, 2));
console.log(cutRod(p, 3));
console.log(cutRod(p, 4));
console.log(cutRod(p, 7));