import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server.bind(('localhost', 12345))
server.listen(1)

print("Server is waiting...")

results = {
    "101": "Pass",
    "102": "Fail",
    "103": "Pass",
    "104": "Pass"
}

while True:
    conn, addr = server.accept()

    reg_no = conn.recv(1024).decode()

    result = results.get(reg_no, "Register number not found")

    conn.send(result.encode())

    conn.close()