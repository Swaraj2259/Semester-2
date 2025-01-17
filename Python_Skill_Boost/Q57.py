# Search for a specific word in a file and replace it with another word, then overwrite the file with the changes.

search_word = 'oldword'
replace_word = 'newword'

with open('file.txt', 'r') as file:
    content = file.read()

updated_content = content.replace(search_word, replace_word)

with open('file.txt', 'w') as file:
    file.write(updated_content)

print(f"Replaced '{search_word}' with '{replace_word}' in the file.")
