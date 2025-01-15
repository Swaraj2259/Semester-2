# •	Implement a function fib(n) to return the nth Fibonacci number using recursion.

def fib(n):
    # Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
    if n <= 1:
        return n
    else:
        # Recursive case: fib(n-1) + fib(n-2)
        return fib(n-1) + fib(n-2)

# Example usage
n = 5
print(f"The {n}th Fibonacci number is {fib(n)}")
