import math
# math module(library) 가져온다.

from math import pi
# math module에서 pi만 가져온다.
# 전부 import시키면(안쓰는것까지) 무거워 질 수 있기 때문에 이런식으로 해줄 수 있다.

def circle(x):
    return pi * x * x

if __name__ == "__main__":
    myVal = circle(3)
    print("반지름이 3인 원의 넓이는 %.2f 입니다." % myVal)

