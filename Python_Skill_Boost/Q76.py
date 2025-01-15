# Write a Python script that reads a text file and prints its contents.

def read_file(filename):
    with open(filename, 'r') as file:
        contents = file.read()  # Read the entire contents of the file
        print(contents)  # Print the contents

# Example usage:
filename = 'example.txt'  # Replace with your file's name
read_file(filename)
