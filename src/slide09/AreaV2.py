def calculateArea(side):
    return side*side


side = int(input("Enter a side for square "))

area = calculateArea(side)

print("Area of the square with that side is: "+str(area))



side2 = int(input("Enter another side for square "))

area2 = calculateArea(side2)

print("Area of the square with that side is: "+str(area2))