# 28. Sum of Digits
# Question:
# Prompt the user for a number (as a string) and compute the sum of its digits.
number = input("Enter a number: ")
sum_digits = sum(int(digit) for digit in number)
print("Sum of digits:", sum_digits)