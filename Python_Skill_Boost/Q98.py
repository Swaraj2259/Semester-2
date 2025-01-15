Use the abc module to define an abstract base class Shape with an abstract method area(). Implement subclasses Circle and Rectangle.


from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14 * self.radius * self.radius

class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width

# Example usage:
circle = Circle(5)
rectangle = Rectangle(4, 6)
print(circle.area())  # Output: 78.5
print(rectangle.area())  # Output: 24
