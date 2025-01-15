# Write a recursive function to compute the Greatest Common Divisor (GCD) of two number

def gcd(a, b):
    if b == 0:
        return a  # Base case: if b is 0, GCD is a
    else:
        return gcd(b, a % b)  # Recursively call with b and remainder of a divided by b
