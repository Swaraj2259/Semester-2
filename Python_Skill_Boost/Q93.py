Demonstrate encapsulation by creating a class with private attributes and use getter and setter methods to access/modify them.

class Person:
    def __init__(self, name, age):
        self.__name = name  # Private attribute
        self.__age = age

    # Getter methods
    def get_name(self):
        return self.__name

    def get_age(self):
        return self.__age

    # Setter methods
    def set_name(self, name):
        self.__name = name

    def set_age(self, age):
        self.__age = age

# Example usage:
person = Person("Alice", 30)
print(person.get_name())  # Output: Alice
person.set_age(31)
print(person.get_age())  # Output: 31
