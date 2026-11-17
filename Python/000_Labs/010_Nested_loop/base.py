s = input("What symbol would you like to use? ")
w = input("What's the width of your box? ")
h = input("What's the height of your box? ")
n = 0
f = 0
for f in range(1,int(h)+1):
    for n in range(1,int(w)):
        print(s, end=" ")
    print(s)