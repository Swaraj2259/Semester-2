# 22. Reverse List
# Question:
# Reverse a list in-place (without using reversed() or slicing).
nums = [1, 2, 3, 4, 5]
start, end = 0, len(nums) - 1
while start < end:
    nums[start], nums[end] = nums[end], nums[start]
    start += 1
    end -= 1
print("Reversed list:", nums)