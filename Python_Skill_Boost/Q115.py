## Decorators: Write a simple decorator timer that measures the execution time of a function.
import time
def timer(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f'{func.__name__} ran in: {end - start} seconds')
        return result
    return wrapper
@timer
def slow_function():
    time.sleep(2)
    print('Slow function done')
slow_function()
@timer
def fast_function():
    print('Fast function done')
fast_function()