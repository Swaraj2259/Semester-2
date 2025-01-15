# Write a recursive function that returns the number of vowels in a string.

def count_vowels(s):
    if not s:
        return 0  # Base case: if the string is empty, return 0
    vowels = "aeiouAEIOU"
    return (1 if s[0] in vowels else 0) + count_vowels(s[1:])  # Check if first character is a vowel and recurse
