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


class Triangle(Shape):
    
    def __init__(self,nameFromOutside, aFromOutside, hFromOutside):
        super(Triangle, self).__init__(nameFromOutside)
        self.a = aFromOutside
        self.h = hFromOutside
    
    @abstractmethod
    def computeArea(self):
        return (self.a * self.h)/2
    
    @abstractmethod
    def printDescription(self):
        print("This is a Triangle with name: "+self.name+" and a: "+str(self.a)+" and h: "+str(self.h)+" and area: "+str(self.computeArea()))


firstTriangle = Triangle("first",4,6)
firstTriangle.printDescription()

square1 = Square("some square",33)
square1.printDescription()
