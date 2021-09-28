function solution(s) {
    return s.split(" ")
    .map(str => 
         str.split("")
         .map((m, idx) => idx % 2 === 0 ? m.toUpperCase() : m.toLowerCase())
         .join("")
    )
    .join(" ");
}

console.log("try hello world"); // "TrY HeLlO WoRlD"