# 32. Fibonacci Sequence
# Question:
# Print the first n Fibonacci numbers using iteration.
n = int(input("Enter the number of Fibonacci numbers to print: "))
a, b = 0, 1
for _ in range(n):
    print(a, end=" ")
    a, b = b, a + b
    