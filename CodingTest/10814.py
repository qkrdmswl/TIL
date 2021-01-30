# 백준 10814번


# 1)
import sys

n = int(sys.stdin.readline())
member = []
for i in range(n):
    member.append(list(sys.stdin.readline().split()))

member.sort(key=lambda x: int(x[0]))

for i in range(n):
    print(member[i][0], member[i][1])


# 2)
print(*sorted([*open(0)][1:], key=lambda a: int(a.split()[0])), sep="")

# 여기서 lambda식이 의미하는 바는 아래와 같다.
# def temp(a):
#     return int(a.split()[0])


# 3)
print(*sorted(eval("input(),"*int(input())), key=lambda x: int(x.split()[0])))

# 1. eval() = int,float 상관 없이 input 내용을 숫자형으로 바꾸어주는 것
#            매개변수로 받은 expression (=식)을 문자열로 받아서, 실행하는 함수
# 2.
