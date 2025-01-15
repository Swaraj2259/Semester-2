# Swap the values of two variables without using a temporary variable
a = int(input("Enter the first variable (a): "))
b = int(input("Enter the second variable (b): "))

a, b = b, a

print("After swapping:")
print("a =", a)
print("b =", b)