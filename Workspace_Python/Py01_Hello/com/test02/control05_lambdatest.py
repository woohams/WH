# lambda : 함수를 쉽게 사용하기 위해 만듬

hap = lambda a, b : a + b
print(hap(1, 5))

gob = lambda a, b : a * b
print(gob(4, 5))

min = (lambda x, y : x if x < y else y)(10, 20)
print(min)

max = (lambda x, y : x if x> y else y)
print(max(10, 20))

a = [(1, 'one', 9), (2, 'two', 8), (3, 'three', 7), (4, 'four', 6)]
a.sort(key = lambda a:a[2]) # a를 2번지 기준으로 정렬
print(a)

b = lambda x: (lambda newx : x + newx)
c = b(100)
print(c)    # lambda 객체가 출력
d = c(90)   # newx에 90이 들어가서 출력값이 만들어짐 !!
print(d)
print(b(100)(90))

e = lambda x : bool(x % 5)
five = [i for i in range(1, 100) if not e(i)]
# if 기준 왼쪽 : 참일 경우, if 기준 오른쪽 : 거짓일 경우
print(five)

f = lambda x : x if(x % 5 != 0) else None
res =[i for i in range(1, 100) if not f(i)]
print(res)



