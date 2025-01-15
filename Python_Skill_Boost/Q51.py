# Write a program that reads a text file and prints its contents to the screen.

# Open the file in read mode
with open('file.txt', 'r') as file:
    # Read and print the contents
    print(file.read())
