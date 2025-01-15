# Write a function that attempts to convert a string to an integer, catching any ValueError and printing a custom message.

def convert_to_int(s):
    try:
        result = int(s)
        print(f"The integer value is {result}")
    except ValueError:
        print("Invalid input! Please enter a valid integer.")

# Example usage
user_input = input("Enter a string to convert to integer: ")
convert_to_int(user_input)
