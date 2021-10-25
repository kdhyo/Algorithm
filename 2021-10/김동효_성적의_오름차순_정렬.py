n = int(input('학생 수를 입력하세요. : '))
arr = []
for i in range(n):
    name, num = input().split()
    arr.append([name, num])

arr = sorted(arr, key=lambda x: x[1])
for x in arr:
    print(x[0], end=' ')