# 10828 스택 구현
import sys


def push(x):
    li.append(x)


def pop():
    if not li:
        return -1
    else:
        return li.pop()


def empty():
    return 0 if li else 1


def top():
    return li[-1] if li else -1


n = int(input())
li = []

for x in range(n):
    input_order = sys.stdin.readline().rstrip().split()
    order = input_order[0]

    if order == 'push':
        push(input_order[1])
    elif order == 'pop':
        print(pop())
    elif order == 'size':
        print(len(li))
    elif order == 'empty':
        print(empty())
    else:
        print(top())
