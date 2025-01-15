## Logging: Write a script that uses the logging module to log debug, info, warning, and error messages to a file.
import logging
def log_messages():
    logging.basicConfig(filename='example.log', level=logging.DEBUG)
    logging.debug('This is a debug message')
    logging.info('This is an info message')
    logging.warning('This is a warning message')
    logging.error('This is an error message')
log_messages()