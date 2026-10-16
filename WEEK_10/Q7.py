# Parking slot: Vehicle type, Availability
parking = {
    "S1": ("Car", "Available"),
    "S2": ("Bike", "Occupied"),
    "S3": ("Car", "Available"),
    "S4": ("Bike", "Available"),
    "S5": ("Car", "Occupied")
}

# Find available slots for a vehicle
def available_slot(vehicle):
    for slot, details in parking.items():
        if details[0] == vehicle and details[1] == "Available":
            print(slot)

# Display available car parking slots
print("Available car parking slots:")
available_slot("Car")