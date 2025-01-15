## Sys Module: Write a script that takes command-line arguments and prints them.
import sys
def print_args():
    for arg in sys.argv[1:]:
        print(arg)