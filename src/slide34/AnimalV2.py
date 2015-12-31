from abc import abstractmethod

class Person:
    
    def __init__(self, nameFromOutside):
        self.name = nameFromOutside

class Animal:
    
    def __init__(self, nameFromOutside, numberOfLegsFromOutside, ownerFromOutside):
        self.name = nameFromOutside
        self.numberOfLegs = numberOfLegsFromOutside
        self.owner = ownerFromOutside
    
    @abstractmethod
    def makeSound(self):
        pass
    
    def printOwnerInfo(self):
        print(self.name.upper()+": my owner is "+self.owner.name.upper())

class Cat(Animal):
    
    def __init__(self, nameFromOutside, ownerFromOutside):
        super(Cat, self).__init__(nameFromOutside,4, ownerFromOutside)
    
    @abstractmethod
    def makeSound(self):
        print(self.name.upper()+": miaooov miaoovvv")

class Dog(Animal):
    
    def __init__(self, nameFromOutside, ownerFromOutside):
        super(Dog, self).__init__(nameFromOutside, 4, ownerFromOutside)
        
    @abstractmethod
    def makeSound(self):
        print(self.name.upper()+": wooof wooofff")
    
    def fetch(self,itemName):
        print(self.name.upper()+": "+self.owner.name+" wanted me to fetch this "+itemName)

me = Person("huseyin")

mycat = Cat("boncuk",me)
mycat.printOwnerInfo()

mydog = Dog("rocky",me)
mydog.printOwnerInfo()

mydog.fetch("stick")

me.name = "ali"

mydog.printOwnerInfo()
