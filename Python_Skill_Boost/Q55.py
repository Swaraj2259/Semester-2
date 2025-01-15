# Write a script that reads a CSV file and prints each row. (Assume the file exists and is properly formatted.)

import csv

# Open the CSV file in read mode
with open('file.csv', 'r') as file:
    csv_reader = csv.reader(file)
    
    # Print each row in the CSV file
    for row in csv_reader:
        print(row)
