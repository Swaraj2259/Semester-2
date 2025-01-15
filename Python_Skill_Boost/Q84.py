Write a program that appends a user-input line to an existing file without overwriting it.

def append_to_file(filename):
    user_input = input("Enter a line to append: ")
    with open(filename, 'a') as file:
        file.write(user_input + '\n')

# Example usage:
append_to_file('example.txt')
