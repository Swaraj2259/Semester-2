Write a Python program that reads a file and counts the number of words in it.

def word_count(filename):
    with open(filename, 'r') as file:
        content = file.read()
        words = content.split()  # Split the content into words
        return len(words)

# Example usage:
filename = 'example.txt'
print(f"Word count: {word_count(filename)}")
