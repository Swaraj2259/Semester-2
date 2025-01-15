Create a class that uses the @property decorator to get/set an attribute with some validation logic.

class Person:
    def __init__(self, name, age):
        self._name = name
        self._age = age

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, value):
        if value < 0:
            raise ValueError("Age cannot be negative")
        self._age = value

# Example usage:
person = Person("Alice", 30)
print(person.age)  # Output: 30
person.age = 35  # Set age to 35
print(person.age)  # Output: 35

# Uncommenting the line below will raise an exception:
# person.age = -5  # Raises ValueError: Age cannot be negative
