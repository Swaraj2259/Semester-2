# Calculate compound interest
# Input values
P = float(input("Enter the principal amount: "))
r = float(input("Enter the annual interest rate (in %): ")) / 100
n = int(input("Enter the number of times interest is compounded per year: "))
t = float(input("Enter the time in years: "))

# Calculate total amount (A)
A = P * (1 + r / n) ** (n * t)

# Calculate compound interest (CI)
CI = A - P

# Output results
print(f"Total Amount (A): {A}")
print(f"Compound Interest (CI): {CI}")