# Search for a specific word in a file and replace it with another word, then overwrite the file with the changes.

# Specify the words to search for and replace
search_word = 'oldword'
replace_word = 'newword'

# Open the file in read mode and read its content
with open('file.txt', 'r') as file:
    content = file.read()

# Replace the search word with the replace word
updated_content = content.replace(search_word, replace_word)

# Open the file in write mode and overwrite with the updated content
with open('file.txt', 'w') as file:
    file.write(updated_content)

print(f"Replaced '{search_word}' with '{replace_word}' in the file.")
