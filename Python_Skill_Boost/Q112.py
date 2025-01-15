## Lambda & Map: Use a lambda function inside map to transform a list of numbers (e.g., multiply each by 2).
list1 = [1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 1]
result = list(map(lambda x: x * 2, list1))
print(result)