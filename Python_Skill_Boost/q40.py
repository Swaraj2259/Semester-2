# Iterative binary search function to find an element in a sorted list
def binary_search(arr, target):
    low, high = 0, len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1  # Return -1 if not found

# Example
arr = list(map(int, input("Enter sorted numbers (separated by spaces): ").split()))
target = int(input("Enter the number to search for: "))

result = binary_search(arr, target)
if result != -1:
    print(f"Number found at index {result}.")
else:
    print("Number not found.")
