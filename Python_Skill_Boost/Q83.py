Write a program to search for a specific substring in a file and print the lines where it appears.

def search_in_file(filename, substring):
    with open(filename, 'r') as file:
        lines = file.readlines()
        for line_num, line in enumerate(lines, start=1):
            if substring in line:
                print(f"Line {line_num}: {line.strip()}")

# Example usage:
search_in_file('example.txt', 'search_term')
