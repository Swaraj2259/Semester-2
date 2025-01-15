# 26. Check Substring
# Question:
# Prompt for a string s and a substring sub. Check if sub is present in s.
s = input("Enter the string: ")
sub = input("Enter the substring: ")
if sub in s:
    print(f"'{sub}' is present in '{s}'")
else:
    print(f"'{sub}' is not present in '{s}'")