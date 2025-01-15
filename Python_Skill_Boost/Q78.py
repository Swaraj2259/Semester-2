Write a Python program to copy the contents of one file to another.

def copy_file(source, destination):
    with open(source, 'r') as src_file:
        content = src_file.read()
    with open(destination, 'w') as dest_file:
        dest_file.write(content)

# Example usage:
copy_file('source.txt', 'destination.txt')
