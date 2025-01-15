# Implement a function factorial(n) that calculates n! using recursion.

def factorial(n):
    # Base case: factorial of 0 or 1 is 1
    if n == 0 or n == 1:
        return 1
    else:
        # Recursive case: n * factorial of n-1
        return n * factorial(n - 1)

# Example usage
n = 5
print(f"The factorial of {n} is {factorial(n)}")
