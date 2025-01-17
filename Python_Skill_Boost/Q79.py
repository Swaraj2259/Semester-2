# Write a Python program that reads a file and counts the number of words in it.

file_name = "source.txt"  

with open(file_name, "r") as file:
    content = file.read()  
words = content.split() 
word_count = len(words) 
print(f"The file '{file_name}' contains {word_count} words.")
