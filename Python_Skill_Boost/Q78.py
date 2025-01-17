# Write a Python program to copy the contents of one file to another.

source_file = "source.txt"  # Name of the file to copy from
destination_file = "destination.txt"  # Name of the file to copy to

with open(source_file, "r") as src:
    content = src.read()

with open(destination_file, "w") as dest:
    dest.write(content)

print(f"Contents of '{source_file}' have been copied to '{destination_file}'.")
