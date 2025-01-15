# Prompt the user for a string and write it to a new text file.

# Prompt the user for a string
user_input = input("Enter a string to write to a file: ")

# Open a new file in write mode and write the string
with open('output.txt', 'w') as file:
    file.write(user_input)

print("The string has been written to output.txt.")
