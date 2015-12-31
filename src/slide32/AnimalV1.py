from abc import abstractmethod

class Animal:
    
    def __init__(self, nameFromOutside, numberOfLegsFromOutside):
        self.name = nameFromOutside
        self.numberOfLegs = numberOfLegsFromOutside
    
    @abstractmethod
    def makeSound(self):
        pass

class Cat(Animal):
    
    def __init__(self, nameFromOutside):
        super(Cat, self).__init__(nameFromOutside,4)
    
    @abstractmethod
    def makeSound(self):
        print(self.name.upper()+": miaooov miaoovvv")

class Dog(Animal):
    
    def __init__(self, nameFromOutside):
        super(Dog, self).__init__(nameFromOutside, 4)
        
    @abstractmethod
    def makeSound(self):
        print(self.name.upper()+": wooof wooofff")
    
    def fetch(self,itemName):
        print(self.name.upper()+": I am now fetching this "+itemName)

mycat = Cat("boncuk")
mycat.makeSound()

mydog = Dog("rocky")
mydog.makeSound()

mydog.fetch("stick")
