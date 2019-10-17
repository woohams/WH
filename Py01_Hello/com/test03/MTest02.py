# -*- coding:utf-8 -*-

def func01(x, y):
    return x + y

def func02(x, y):
    return x + y, x - y

if __name__ == "__main__":
    a = func01(1, 3)
    print(a)
    b, c = func02(10, 4)
    print(b, c) # return값 여러개 가능 !!
    
    
    
