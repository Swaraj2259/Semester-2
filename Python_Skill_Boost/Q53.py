# Copy the contents of one text file to another.

with open('source.txt', 'r') as source_file:
    with open('destination.txt', 'w') as dest_file:
        dest_file.write(source_file.read())

print("Contents have been copied from source.txt to destination.txt.")
