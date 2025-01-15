Modify the Car class to have default values for make and model if not provided. 

class Car:
    def __init__(self, make="Unknown", model="Unknown", year=None):
        self.make = make
        self.model = model
        self.year = year if year else "Unknown"

# Example usage:
car = Car()
print(f"Make: {car.make}, Model: {car.model}, Year: {car.year}")
car2 = Car("Toyota", "Corolla", 2020)
print(f"Make: {car2.make}, Model: {car2.model}, Year: {car2.year}")
