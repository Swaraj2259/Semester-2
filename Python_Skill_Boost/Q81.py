# Modify the file-reading program to handle exceptions (e.g., file not found) gracefully.

def read_file_with_exception_handling(source.txt):
    try:
        with open("source.txt", 'r') as file:
            content = file.read()
            print(content)
    except FileNotFoundError:
        print("Error: File not found!")
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage:
read_file_with_exception_handling('example.txt')
