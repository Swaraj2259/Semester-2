# Write a Python script that reads a text file and prints its contents.

file = open("example.txt", "r")
content = file.read()
print(content)
file.close()
