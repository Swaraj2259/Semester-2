# Define a class Point(x, y) that overloads the + operator to add the coordinates of two Point objects.

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, other):
        # Overload the + operator to add the coordinates of two points
        return Point(self.x + other.x, self.y + other.y)

    def __str__(self):
        return f"Point({self.x}, {self.y})"

# Example usage
point1 = Point(2, 3)
point2 = Point(4, 5)

# Adding two Point objects
result = point1 + point2

print(result)  # Output: Point(6, 8)
