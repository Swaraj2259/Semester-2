Create a class Point that overloads the + operator (using __add__) to add the coordinates of two Point objects.

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, other):
        return Point(self.x + other.x, self.y + other.y)

    def __str__(self):
        return f"Point({self.x}, {self.y})"

# Example usage:
point1 = Point(1, 2)
point2 = Point(3, 4)
result = point1 + point2
print(result)  # Output: Point(4, 6)
