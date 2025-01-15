Demonstrate polymorphism by defining a method draw() in multiple classes (Circle, Triangle, etc.) and calling draw() on a list of shapes.

class Circle:
    def draw(self):
        print("Drawing a Circle")

class Triangle:
    def draw(self):
        print("Drawing a Triangle")

class Square:
    def draw(self):
        print("Drawing a Square")

# Example usage:
shapes = [Circle(), Triangle(), Square()]
for shape in shapes:
    shape.draw()  # Demonstrates polymorphism
