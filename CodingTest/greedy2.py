# 숫자 카드 게임
# N=행, M=열

n, m = map(int, input().split())
smalls = []

for i in range(n):
    data = list(map(int, input().split()))
    smalls.append(min(data))


result = max(smalls)
print(result)
