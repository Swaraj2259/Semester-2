	# Implement binary search recursively to find an element in a sorted list.

def binary_search(arr, target, low, high):
    if low > high:
        return -1  # Element not found
    
    mid = (low + high) // 2  # Find the middle index
    
    if arr[mid] == target:
        return mid  # Element found at the mid index
    elif arr[mid] < target:
        return binary_search(arr, target, mid + 1, high)  # Search in the right half
    else:
        return binary_search(arr, target, low, mid - 1)  # Search in the left half


 