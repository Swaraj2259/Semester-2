# Implement the bubble sort algorithm
numbers = list(map(int, input("Enter numbers to sort (separated by spaces): ").split()))

for i in range(len(numbers)):  
    for j in range(len(numbers) - i - 1):  
        if numbers[j] > numbers[j + 1]:  # If the first number is bigger, swap them
            numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]

print("Sorted list:", numbers)