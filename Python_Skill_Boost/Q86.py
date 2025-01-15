Define a class Person with attributes name and age. Create an instance of this class and print its attributes.Define a class Person with attributes name and age. Create an instance of this class and print its attributes.

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

# Example usage:
person = Person("Alice", 30)
print(f"Name: {person.name}, Age: {person.age}")
