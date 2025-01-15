# 23. Count Occurrences in List
# Question:
# Given a list of integers, prompt for a specific integer and count how many times it appears.
nums = [1, 2, 3, 2, 5, 2]
target = int(input("Enter the number to count occurrences: "))
count = 0
for num in nums:
    if num == target:
        count += 1
print(f"The number {target} appears {count} times.")