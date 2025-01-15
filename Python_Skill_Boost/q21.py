# 21. Minimum & Maximum in List
# Question:
# Find the minimum and maximum values in a list without using built-in min() or max().
nums = [5, 10, 15, 3, 20]
min_value = nums[0]
max_value = nums[0]
for num in nums:
    if num < min_value:
        min_value = num
    if num > max_value:
        max_value = num
print("Minimum value:", min_value)
print("Maximum value:", max_value)