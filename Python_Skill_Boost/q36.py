import random

# Generate a random number between 1 and 10
random_number = random.randint(1, 10)

# User guesses until they get it right
guess = 0
while guess != random_number:
    guess = int(input("Guess the number between 1 and 10: "))
    if guess < random_number:
        print("Too low! Try again.")
    elif guess > random_number:
        print("Too high! Try again.")
    else:
        print("Correct! You've guessed the number.")