# Write a program that prompts the user for a line of text and writes that line to a file.


text = input("Enter a line of text: ")

file=open("output.txt", "w")
writing=file.write(text)

print("The text has been written to 'output.txt'.")

