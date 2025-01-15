Create a base class Animal and a derived class Dog. The Dog class should inherit attributes and methods from Animal.

class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return "Some sound"

class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name)
        self.breed = breed

# Example usage:
dog = Dog("Buddy", "Golden Retriever")
print(dog.name)  # Inherited from Animal
print(dog.speak())  # Inherited from Animal
