	# Implement binary search recursively to find an element in a sorted list.

def binary_search(arr, target, low, high):
    if low > high:
        return -1  
    
    mid = (low + high) // 2 
    
    if arr[mid] == target:
        return mid  # Element found at the mid index
    elif arr[mid] < target:
        return binary_search(arr, target, mid + 1, high)  # Search in the right half
    else:
        return binary_search(arr, target, low, mid - 1)  # Search in the left half

# Example
arr = list(map(int, input("Enter sorted numbers (separated by spaces): ").split()))
target = int(input("Enter the number to search for: "))

result = binary_search(arr, target)
if result != -1:
    print(f"Number found at index {result}.")
else:
    print("Number not found.")
 