# Write a recursive function that computes the sum of all elements in a list.

def sum_of_list(lst):
    if not lst:
        return 0
    return lst[0] + sum_of_list(lst[1:])
