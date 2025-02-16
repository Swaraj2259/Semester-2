# Write a script that reads a CSV file and prints each row. (Assume the file exists and is properly formatted.)

import csv

with open('example.csv', 'r') as file:
    csv_reader = csv.reader(file)
    
    for row in csv_reader:
        print(row)
