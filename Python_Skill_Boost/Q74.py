# Write a recursive function that checks if a string is a palindrome.

def is_palindrome(s):
    # Base case: If the string is empty or has one character, it is a palindrome
    if len(s) <= 1:
        return True
    # Recursive case: Check the first and last characters, then recurse on the substring
    if s[0] == s[-1]:
        return is_palindrome(s[1:-1])
    else:
        return False
