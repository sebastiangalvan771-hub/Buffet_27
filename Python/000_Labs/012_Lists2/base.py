import random
x = input("How many random numbers would you like? ")
y = 0
thislist = []
for y in range(0,int(x)):
    thislist.append(random.randrange(1,10))
    print(thislist[y],end=", ")