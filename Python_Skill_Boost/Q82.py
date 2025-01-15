Write a program that finds the longest word in a text file and prints 

def find_longest_word(filename):
    with open(filename, 'r') as file:
        words = file.read().split()  # Split the content into words
        longest_word = max(words, key=len)  # Find the longest word
        return longest_word

# Example usage:
filename = 'example.txt'
print(f"The longest word is: {find_longest_word(filename)}")
