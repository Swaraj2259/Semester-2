## Requests Module: Write a program (assuming you have internet access) that fetches data from a public API using the requests module and prints part of the JSON response.
import requests
def fetch_data():
    response = requests.get('https://jsonplaceholder.typicode.com/posts/1')
    data = response.json()
    print(data['title'])
fetch_data()