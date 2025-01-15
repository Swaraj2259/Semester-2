# Copy the contents of one text file to another.

# Open the source file in read mode and the destination file in write mode
with open('source.txt', 'r') as source_file:
    with open('destination.txt', 'w') as dest_file:
        # Read the contents from the source file and write them to the destination file
        dest_file.write(source_file.read())

print("Contents have been copied from source.txt to destination.txt.")
