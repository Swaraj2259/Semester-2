## Use Random Module: Write a function that randomly selects an element from a given list using the random module.
import random
def random_element(list):
    return random.choice(list)
print(random_element([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))