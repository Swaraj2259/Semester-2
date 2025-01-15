# Create a class Person with attributes name and age. Include a method greet() that prints "Hello, my name is <name>."

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self):
        print(f"Hello, my name is {self.name}.")

# Example usage
person1 = Person("Alice", 30)
person1.greet()
