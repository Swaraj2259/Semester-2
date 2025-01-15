# Read data from a JSON file, modify a value, and write the updated data back to the file.

import json

# Read data from the JSON file
with open('data.json', 'r') as file:
    data = json.load(file)

# Modify a value in the data (example: changing the value of a specific key)
data['key_name'] = 'new_value'

# Write the updated data back to the JSON file
with open('data.json', 'w') as file:
    json.dump(data, file, indent=4)

print("Updated data has been written back to the file.")
