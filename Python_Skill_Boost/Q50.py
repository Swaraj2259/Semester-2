# Using the GCD function, write a function lcm(a, b) that returns the least common multiple.

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return (a * b) // gcd(a, b)

# Example usage
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

result = lcm(num1, num2)
print(f"The LCM of {num1} and {num2} is {result}.")
