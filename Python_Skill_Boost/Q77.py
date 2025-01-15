Write a program that prompts the user for a line of text and writes that line to a file.

def write_to_file(filename):
    text = input("Enter a line of text: ")  # Prompt the user for input
    with open(filename, 'w') as file:
        file.write(text)  # Write the text to the file

# Example usage:
filename = 'output.txt'  # Replace with your desired file name
write_to_file(filename)
