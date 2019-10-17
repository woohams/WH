import pickle

score = {'name' : 'kh', 'kor' : 100, 'eng' : 50, 'math' : 44}
#print(type(score))
# <class 'dict'>

with open('test02.txt', 'wb') as file:
    pickle.dump(score, file)



