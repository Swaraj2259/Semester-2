# Python program to calculate student marks and results

# Step 2: Store Student Details
name = input("Enter Student Name: ")
roll_number = int(input("Enter Roll Number: "))
marks1 = int(input("Enter Marks for Subject 1: "))
marks2 = int(input("Enter Marks for Subject 2: "))
marks3 = int(input("Enter Marks for Subject 3: "))

# Step 3: Perform Calculations
total_marks = marks1 + marks2 + marks3
max_marks = 300  # Assuming each subject is out of 100
percentage = (total_marks / max_marks) * 100
status = "Pass" if marks1 >= 40 and marks2 >= 40 and marks3 >= 40 else "Fail"

# Step 4: Show Results
print("\n--- Student Report ---")
print(f"Name: {name}")
print(f"Roll Number: {roll_number}")
print(f"Marks: {marks1}, {marks2}, {marks3}")
print(f"Total Marks: {total_marks}")
print(f"Percentage: {percentage:.2f}%")
print(f"Status: {status}")

# Bonus: Adding Grades
if status == "Pass":
    if percentage >= 90:
        grade = 'A'
    elif percentage >= 75:
        grade = 'B'
    elif percentage >= 50:
        grade = 'C'
    else:
        grade = 'D'
    print(f"Grade: {grade}")