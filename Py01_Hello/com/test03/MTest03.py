# 1. for 문을 사용하여 구구단을 출력하는 gugu() 함수를 만들어 호출 !


# 2. while 문을 사용하여 내가 원하는 단의 구구단만 출력하는 gugudan(x) 함수를 만들어 호출 !


def gugu():
    print('구구단')
    for i in range(2, 10):
        print()
        print("====== ", str(i)+"단 ======")
        for j in range(1, 10):
            print(str(i),' * ', str(j), ' = ',str(i*j))


def gugudan(x):
    print("=== ",str(x), "단 ===")
    i = 1
    while i < 10:
        print('%d * %d = %d' % (x, i, x * i))
        i += 1

if __name__ == '__main__':
#    print(gugu())
    dan = input('단 입력 : ')
    print(dan)
    gugudan(int(dan))
    
    
    
    
    
    
    