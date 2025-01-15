# Read a file and count how many lines it contains.

# Open the file in read mode
with open('file.txt', 'r') as file:
    # Count the number of lines
    line_count = sum(1 for line in file)

print(f"The file contains {line_count} lines.")
