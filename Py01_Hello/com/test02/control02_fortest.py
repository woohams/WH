subject = ['java','database','javascript','spring','python']

for i in subject:
    print(i)
else:
    print('끝!')


for i in range(1, 100):
    print(i)

print('구구단')
for i in range(2, 10):
    print(str(i)+"단")
    for j in range(1,10):
        print(str(i) + " * " + str(j) + " = " + str(i*j))
        print(str(i),' * ', str(j), ' = ',str(i*j))
        print('%d * %d = %d' % (i,j,i*j))
        
        
for i in range(10):
    print(i, sep = ' ',end='\t')
    
for i in range(10,0,-1):
    print(i)