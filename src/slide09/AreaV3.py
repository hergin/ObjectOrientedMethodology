def calculateArea(side):
    return side*side


def promptForSide(firstPromptText):
    side = int(input(firstPromptText))
    return side


side = promptForSide("Please enter a side ")
area = calculateArea(side)
print("Area of your square is: "+str(area))
