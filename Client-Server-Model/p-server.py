from concurrent.futures import thread
from http.server import BaseHTTPRequestHandler, HTTPServer
import threading
import time
import requests

hostName = "localhost"
serverPort = 8080

class Server(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.end_headers()
        self.wfile.write(bytes("""{
            "name": "Python Server",
            "response": "Res"
        }""", "utf-8"))

def runServer():
    webServer = HTTPServer((hostName, serverPort), Server)
    print(f"Server started http://{hostName}:{serverPort}")
    
    try:
        webServer.serve_forever()
    except KeyboardInterrupt:
        pass

    webServer.server_close()
    print("Server stopped.")        

def runTask():
    print("Task started")
    while True:
        time.sleep(1)
        response = requests.get("http://localhost:8080")
        data = response.json()
        print(f"Name: {data['name']}, response: {data['response']}")

if __name__ == "__main__":    
    serverThread = threading.Thread(target=runServer, daemon=False)
    taskThread = threading.Thread(target=runTask, daemon=True)
    serverThread.start()
    taskThread.start()
    