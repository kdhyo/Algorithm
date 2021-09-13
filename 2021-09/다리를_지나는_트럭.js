function solution(bridge_length, weight, truck_weights) {
    const queue = new Array(bridge_length).fill(0);
    let count = 0;
    let num = 0;
    while(truck_weights.length > 0) {
        num = num - queue.shift();
        if(num + truck_weights[0] <= weight) {
            const truck = truck_weights.shift();
            num += truck;
            queue.push(truck);
        } else {
            queue.push(0);
        }
        count++;
    }
    
    return count + bridge_length;
}