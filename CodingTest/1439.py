# 백준 1439

# 1)
S = input()
count = 0
for i in range(len(S)-1):
    if S[i] != S[i+1]:
        count += 1
print((count + 1) // 2)

# 2) Greedy 이용
s = input()
a = 0
b = 0

if s[0] == '0':
    a = 1
else:
    b = 1

# a는 0으로 바뀌는 횟수, b는 1로 바뀌는 횟수
for i in range(1, len(s)):
    if s[i] != s[i-1]:
        if s[i] == '0':
            a += 1
        else:
            b += 1

if a >= b:
    print(b)
else:
    print(a)