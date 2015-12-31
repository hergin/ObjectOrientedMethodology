from abc import abstractmethod

class Shape:
    
    def __init__(self, nameFromOutside):
        self.name = nameFromOutside
    
    @abstractmethod
    def computeArea(self):
        pass
    
    @abstractmethod
    def printDescription(self):
        pass


class Square(Shape):
    
    def __init__(self, nameFromOutside, sideFromOutside):
        super(Square, self).__init__(nameFromOutside)
        self.side = sideFromOutside
    
    @abstractmethod
    def computeArea(self):
        return self.side * self.side
    
    @abstractmethod
    def printDescription(self):
        print("This is a Square with name: "+self.name+" and side: "+str(self.side)+" and area: "+str(self.computeArea()))


mySq = Square("mySquare",5)

print(str(mySq.computeArea()))

print("side of a square mySq is: "+str(mySq.side))

mySq.printDescription()

secondSquare = Square("secondSquare",10)

secondSquare.printDescription()