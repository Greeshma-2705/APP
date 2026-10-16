# Student results
students = {
    "Arun": ("Pass", "Pass"),
    "Bala": ("Pass", "Fail"),
    "Charan": ("Pass", "Pass"),
    "Divya": ("Fail", "Pass")
}

# Check eligibility
def eligible(student):
    return student[0] == "Pass" and student[1] == "Pass"

# Display eligible students
print("Eligible students:")
for name, result in students.items():
    if eligible(result):
        print(name)