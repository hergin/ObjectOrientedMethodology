class Animal:
    def __init__(self,typ,leg_count,sound,name):
        self.type = typ
        self.leg_count = leg_count
        self.sound = sound
        self.name = name
        
    def info(self):
        print("I am a " + self.type)
        print("I have " + str(self.leg_count) + " legs")
        print("My sound is: " + self.sound)
        print("My name is: " + self.name)


class Dog(Animal):
    def __init__(self, name):
        Animal.__init__(self, "dog", 4, "woof woof", name)


class Chicken(Animal):
    def __init__(self, name):
        Animal.__init__(self, "chicken", 2, "cluck cluck", name)


rexx = Dog("Rexx")
rexx.info()

bingo = Dog("Bingo")
bingo.info()

rocky = Dog("Rocky")
rocky.info()

angel = Chicken("Angel")
angel.info()

coco = Chicken("Cococ")
coco.info()