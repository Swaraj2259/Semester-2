# Write a program that reads a text file and prints its contents to the screen.

# Open the file in read mode
with open('source.txt', 'r') as file:
    print(file.read())
