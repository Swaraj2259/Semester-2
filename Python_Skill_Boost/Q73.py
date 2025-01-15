# Write a recursive function that takes a list which may contain nested lists and returns a flat list of all elements.

def flatten(lst):
    flat_list = []
    for item in lst:
        if isinstance(item, list):  # If the item is a list, recurse
            flat_list.extend(flatten(item))
        else:
            flat_list.append(item)  # If the item is not a list, add it directly
    return flat_list
