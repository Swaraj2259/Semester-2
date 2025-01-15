Demonstrate multiple inheritance with two parent classes providing different functionalities to a child class.

class Animal:
    def speak(self):
        print("Animal makes a sound")

class Swimmer:
    def swim(self):
        print("Swimmer can swim")

class Dolphin(Animal, Swimmer):
    def speak(self):
        print("Dolphin says 'Click click!'")

# Example usage:
dolphin = Dolphin()
dolphin.speak()  # Output: Dolphin says 'Click click!'
dolphin.swim()  # Output: Swimmer can swim
