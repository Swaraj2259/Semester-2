# Create a base class Animal and a derived class Dog. Override a method speak() in the Dog class to print "Woof!".

# Base class
class Animal:
    def speak(self):
        print("Animal makes a sound.")

# Derived class
class Dog(Animal):
    def speak(self):
        print("Woof!")

# Example usage
animal = Animal()
animal.speak()  # Calls the base class method

dog = Dog()
dog.speak()  # Calls the overridden method in the Dog class
