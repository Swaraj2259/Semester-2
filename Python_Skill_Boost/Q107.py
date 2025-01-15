## Json Module: Write a script that reads a JSON file, modifies a value, and writes the updated data back to the file.
import json
def read_json(file_name):
    with open(file_name, 'r') as file:
        data = json.load(file)
        data['name'] = 'John'
    with open(file_name, 'w') as file:
        json.dump(data, file)
read_json('question107.json')