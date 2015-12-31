def printShapeInfo(shapeName):
    
    sides = 0
    if(shapeName=="Rectangle"):
        sides = 4
    elif(shapeName=="Triangle"):
        sides = 3
    elif(shapeName=="Octagon"):
        sides = 8
        
    print("A "+shapeName+" has "+str(sides)+" sides!")

printShapeInfo("Rectangle")

printShapeInfo("Triangle")

printShapeInfo("Octagon")