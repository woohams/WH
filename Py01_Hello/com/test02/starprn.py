# 1
# *
# **
# ***
# ****
# *****

for i in range(5):
    for j in range(i+1):
        print( '*', end='')
    print()

    
# 2
# *****
# ****
# ***
# **
# *
print()
for i in range(5):
    for j in range(5-i):
        print( '*', end='')
    print()

# 3
#     *
#    **
#   ***
#  ****
# *****
print()
for i in range(5):
    for j in range(4-i):
        print( ' ', end='')
    for k in range(i+1):
        print( '*', end='')
    print()
    
# 4
# *****
#  ****
#   ***
#    **
#     *
print()
for i in range(5):
    for j in range(i):
        print( ' ', end='')
    for k in range(5-i):
        print('*', end='')
    print()

# 5
#     *
#    ***
#   *****
#  *******
# *********
print()
for i in range(5):
    for j in range(4-i):
        print( ' ', end='')
    for j in range(2 * i+1):
        print( '*', end='')
    print()



