Write a program that counts how many lines are in a file.

def line_count(filename):
    with open(filename, 'r') as file:
        lines = file.readlines()  # Read all lines in the file
        return len(lines)

# Example usage:
filename = 'example.txt'
print(f"Line count: {line_count(filename)}")
