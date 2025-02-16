# Count how often each element appears in a list and store the result in a dictionary.

elements = [1, 2, 2, 3, 3, 4, 4, 4, 4]


frequency = {}

for item in elements:

    if item in frequency:
        # Increment the count if it exists
        frequency[item] += 1
    else:
        # Initialize the count if it does not exist
        frequency[item] = 1

# Print the frequency dictionary
print("Frequency of elements:", frequency)
