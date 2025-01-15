# Demonstrating string slicing
s = "Hello, World!"

# Reverse the string
print("Reversed string:", s[::-1])

# Skip every other letter
print("Skipping letters:", s[::2])

# Slice a substring
print("Substring (from index 0 to 4):", s[0:5])

















s = "Python"
print(s[0:3])  # Output: Pyt (characters from index 0 to 2)
print(s[:4])   # Output: Pyth (characters from start to index 3)
print(s[2:])   # Output: thon (from index 2 to the end)
print(s[-3:])  # Output: hon (last 3 characters)