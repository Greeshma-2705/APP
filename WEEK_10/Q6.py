# Employee: Experience, Training, Rating
employees = {
    "Ravi": (6, "Completed", 5),
    "Priya": (3, "Completed", 4),
    "Kumar": (8, "Not Completed", 5),
    "Meena": (7, "Completed", 4)
}

# Check promotion eligibility
def eligible(employee):
    experience, training, rating = employee
    return experience >= 5 and training == "Completed" and rating >= 4

# Display eligible employees
print("Employees eligible for promotion:")
for name, details in employees.items():
    if eligible(details):
        print(name)