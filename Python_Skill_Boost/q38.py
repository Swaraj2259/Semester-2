# Implement the bubble sort algorithm
numbers = list(map(int, input("Enter numbers to sort (separated by spaces): ").split()))

# Bubble Sort
for i in range(len(numbers)):  # Go through the list multiple times
    for j in range(len(numbers) - i - 1):  # Compare each pair of numbers
        if numbers[j] > numbers[j + 1]:  # If the first number is bigger, swap them
            numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]

# Print the sorted list
print("Sorted list:", numbers)