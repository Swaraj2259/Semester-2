# Implement a function recursive_sum(lst) that sums all elements in a list using recursion.

def recursive_sum(lst):
    if not lst:  # Base case: if the list is empty
        return 0
    return lst[0] + recursive_sum(lst[1:])  # Add the first element to the sum of the rest

# Example list
numbers = [1, 2, 3, 4, 5]

# Calculate the sum
result = recursive_sum(numbers)

# Print the result
print("Sum of elements:", result)
