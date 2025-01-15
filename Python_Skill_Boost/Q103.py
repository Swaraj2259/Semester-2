## Use Datetime Module: Write a script that gets the current date and time and formats it as YYYY-MM-DD HH:MM:SS.
import datetime
print(datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S"))