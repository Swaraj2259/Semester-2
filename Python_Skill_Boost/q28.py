# 28. Sum of Digits
# Question:
# Prompt the user for a number (as a string) and compute the sum of its digits.
number = input("Enter a number: ")
sum=0
for each in number:
    sum=sum+int(each)
print(f"Sum is :{sum}")
