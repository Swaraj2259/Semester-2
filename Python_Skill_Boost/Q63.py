# Create a class with a private attribute _balance and provide get_balance() and set_balance() methods.

class Account:
    def __init__(self, balance):
        self._balance = balance  # Private attribute

    def get_balance(self):
        return self._balance

    def set_balance(self, balance):
        if balance >= 0:  # Ensure the balance is non-negative
            self._balance = balance
        else:
            print("Balance cannot be negative.")

# Example usage
account = Account(1000)
print("Initial balance:", account.get_balance())  # Get the balance

account.set_balance(1500)  # Set a new balance
print("Updated balance:", account.get_balance())

account.set_balance(-500)  # Try setting a negative balance (invalid)
