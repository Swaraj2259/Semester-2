# •	Write a recursive function power(base, exp) that computes base^exp.

def power(base, exp):
    # Base case: power(base, 0) is 1
    if exp == 0:
        return 1
    else:
        # Recursive case: base * power(base, exp-1)
        return base * power(base, exp - 1)

# Example usage
base = 2
exp = 3
print(f"{base}^{exp} = {power(base, exp)}")
