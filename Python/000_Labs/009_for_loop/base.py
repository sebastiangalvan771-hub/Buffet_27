x = input("Please enter line length: ")
y = input("Do you want a horizontal or vertical line? ")

if y == "horizontal":
    for x in range(0,int(x)):
        print("-", end=" ")
if y == "vertical":
    for x in range(0,int(x)):
        print("|")



