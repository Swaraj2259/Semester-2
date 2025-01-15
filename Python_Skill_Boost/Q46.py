# Count how often each element appears in a list and store the result in a dictionary.

# Example list
numbers = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]

# Count occurrences
count_dict = {}
for num in numbers:
    count_dict[num] = count_dict.get(num, 0) + 1

# Print the result
print("Element counts:", count_dict)


