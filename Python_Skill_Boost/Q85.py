Write a Python script to read a CSV file and print each row.

import csv

def read_csv(filename):
    with open(filename, newline='') as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            print(row)

# Example usage:
read_csv('example.csv')
