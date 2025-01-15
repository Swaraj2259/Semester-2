Implement a Python class that overloads the __str__ method to return a string representation of the object.

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"Person(Name: {self.name}, Age: {self.age})"

# Example usage:
person = Person("Alice", 30)
print(person)  # Output: Person(Name: Alice, Age: 30)
