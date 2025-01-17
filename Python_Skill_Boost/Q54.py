# Write a program that counts how many lines are in a file.

file_name = "source.txt"  

with open(file_name, "r") as file:
    lines = file.readlines()

line_count = len(lines)

print(f"The file '{file_name}' contains {line_count} lines.")