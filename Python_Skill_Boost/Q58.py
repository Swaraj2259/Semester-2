# 58.	**Simple Logging**

# •	Use Python’s logging module to log info and error messages in a script
import logging
logging.basicConfig(level=logging.INFO, filename='app.log', filemode='w')
logging.info("This is an info message.")
logging.error("This is an error message.")
