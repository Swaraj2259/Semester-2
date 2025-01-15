Create a class Counter with a class variable count. Implement a @classmethod to increment count and a @staticmethod to display some utility message. 

class Counter:
    count = 0

    @classmethod
    def increment(cls):
        cls.count += 1

    @staticmethod
    def display_message():
        print("Utility message from the static method.")

# Example usage:
Counter.increment()
Counter.increment()
print(Counter.count)  # Output: 2
Counter.display_message()  # Output: Utility message from the static method.
