## Statistics Module: Use the statistics module to compute the mean, median, and mode of a list of numbers.
import statistics
def compute_stats(list):
    return statistics.mean(list), statistics.median(list), statistics.mode(list)
print(compute_stats([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))