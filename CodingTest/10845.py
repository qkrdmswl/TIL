import sys


def push(x):
    queue.append(x)


def pop():
    if not queue:
        return -1
    else:
        queue.reverse()
        val = queue.pop(-1)
        queue.reverse()
        return val


def size():
    return len(queue)


def empty():
    return 1 if not queue else 0


def front():
    return queue[0] if queue else -1


def back():
    return queue[-1] if queue else -1


n = int(input())
queue = []
for x in range(n):
    input_order = sys.stdin.readline().rstrip().split()
    order = input_order[0]
    if order == 'push':
        push(input_order[1])
    elif order == 'pop':
        print(pop())
    elif order == 'size':
        print(size())
    elif order == 'empty':
        print(empty())
    elif order == 'front':
        print(front())
    else:
        print(back())
