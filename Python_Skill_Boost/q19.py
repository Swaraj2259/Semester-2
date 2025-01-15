# Prompt for 5 integers and store them in a list
nums = []
for i in range(5):
    num = int(input(f"Enter number {i+1}: "))
    nums.append(num)

print("List of numbers:", nums)
print("Length of the list:", len(nums))
 

















nums = list(map(int, input("Enter 5 numbers separated by spaces: ").split()))
print("List of numbers:", nums)
print("Length of the list:", len(nums))