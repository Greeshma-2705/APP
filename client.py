import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

temperature = input("Enter temperature: ")

client.sendto(temperature.encode(), ('localhost', 12345))

print("Temperature sent successfully")

client.close()