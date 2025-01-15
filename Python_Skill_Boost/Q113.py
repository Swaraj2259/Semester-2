## Filter & Reduce: Use filter to filter out even numbers from a list, then use functools.reduce to sum the filtered numbers.
import functools
list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
filtered = list(filter(lambda x: x % 2 != 0, list1))
result = functools.reduce(lambda x, y: x + y, filtered)
print(result)