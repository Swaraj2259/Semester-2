# Calculate power without using built-in functions
base = int(input("Enter the base: "))
exp = int(input("Enter the exponent: "))
result = 1
for _ in range(exp):
    result *= base
print(base,"^",exp, " =", result)