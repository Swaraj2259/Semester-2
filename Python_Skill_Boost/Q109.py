## Regex Basics: Write a script that extracts all email addresses from a given string using the re module.
import re
def extract_emails(string):
    return re.findall(r'\S+@\S+', string)
print(extract_emails('This is a test email address:'))