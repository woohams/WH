file = open('test01.txt', 'a')
file.writelines('\nHello, Python!!!!\nHello, KH!!!!')
file.close()

'''
r : 읽기
w : 쓰기 (기존 내용 덮어쓰기)
a : 파일 끝에 쓰기 (기존 내용 뒤에)
x : 파일 없을 때 파일 만들어서 쓰기 (파일 있으면 에러)
t / b : text / binary(default : t)

'''