# Function to check if a number is prime
def is_prime(num):
    if num <= 1:
        return False 
    for i in range(2, int(num ** 0.5) + 1):  
        if num % i == 0:
            return False  # If divisible by any number other than 1 and itself, it's not prime
    return True  


start = int(input("Enter the start of the range: "))
end = int(input("Enter the end of the range: "))
print(f"Prime numbers between {start} and {end} are:")

# Loop through the range and check for prime numbers
for i in range(start, end + 1):
    if is_prime(i):
        print(i, end=" ")