# Find the second largest element in a list
lst = [10, 20, 4, 45, 99]
lst = list(set(lst))  # Remove duplicates
lst.sort()
second_large=lst[-2]
print(f"Second largest element: {second_large}")
