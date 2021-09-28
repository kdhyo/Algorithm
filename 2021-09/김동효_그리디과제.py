n, m, k = map(int, input('숫자 세 개를 입력하세요: ').split())
arr = list(map(int, input(str(n) + ' 개의 숫자를 입력하세요: ').split()))
arr.sort(reverse=True)

result = 0
for i in range(1, m+1):
    result += arr[1] if i % k == 0 else arr[0]

print(result)