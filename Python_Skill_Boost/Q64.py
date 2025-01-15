# Define classes Circle, Square, and Triangle each with a draw() method. Call draw() on a list of shape objects to demonstrate polymorphism.

# Base classes for different shapes
class Circle:
    def draw(self):
        print("Drawing a Circle.")

class Square:
    def draw(self):
        print("Drawing a Square.")

class Triangle:
    def draw(self):
        print("Drawing a Triangle.")

# List of shape objects
shapes = [Circle(), Square(), Triangle()]

# Demonstrate polymorphism by calling draw() on each shape
for shape in shapes:
    shape.draw()
