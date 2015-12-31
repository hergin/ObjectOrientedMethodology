def printShapeInfo(shapeName,sideLength=5):
    
    sides = 0
    area = 0
    
    if(shapeName=="Rectangle"):
        sides = 4
        area = sideLength*sideLength
    elif(shapeName=="Triangle"):
        sides = 3
        area = 0.86*sideLength
        
    print("A "+shapeName+" has "+str(sides)+" sides and area is "+str(area)+" when length is "+str(sideLength))

printShapeInfo("Rectangle",4)

printShapeInfo("Triangle")
