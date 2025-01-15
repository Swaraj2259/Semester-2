# Use Python’s logging module to log info and error messages in a script.

import logging

# Set up the logging configuration
logging.basicConfig(level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')

# Example info and error messages
logging.info("This is an informational message.")
logging.error("This is an error message.")

# Example of a division by zero to log an exception
try:
    result = 10 / 0
except ZeroDivisionError as e:
    logging.error("Error occurred: %s", e)
