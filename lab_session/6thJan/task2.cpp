#include <iostream>
#include <string>
using namespace std;

int main() {
    // Step 2: Store Student Details
    string name;
    int rollNumber, marks1, marks2, marks3;

    cout << "Enter Student Name: ";
    cin >> ws; // To handle whitespaces in input
    getline(cin, name);

    cout << "Enter Roll Number: ";
    cin >> rollNumber;

    cout << "Enter Marks for Subject 1: ";
    cin >> marks1;

    cout << "Enter Marks for Subject 2: ";
    cin >> marks2;

    cout << "Enter Marks for Subject 3: ";
    cin >> marks3;

    // Step 3: Perform Calculations
    int totalMarks = marks1 + marks2 + marks3;
    int maxMarks = 300; // Assuming each subject is out of 100
    double percentage = (totalMarks / (double)maxMarks) * 100;

    string status = (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) ? "Pass" : "Fail";

    // Step 4: Show Results
    cout << "\n--- Student Report ---" << endl;
    cout << "Name: " << name << endl;
    cout << "Roll Number: " << rollNumber << endl;
    cout << "Marks: " << marks1 << ", " << marks2 << ", " << marks3 << endl;
    cout << "Total Marks: " << totalMarks << endl;
    cout << "Percentage: " << percentage << "%" << endl;
    cout << "Status: " << status << endl;

    // Bonus: Adding Grades
    if (status == "Pass") {
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        cout << "Grade: " << grade << endl;
    }

    return 0;
}