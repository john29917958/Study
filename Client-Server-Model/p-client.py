import requests

response = requests.get("http://localhost:8080/", params={})
data = response.json()

print(data)
