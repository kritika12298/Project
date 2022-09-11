# Explanation

## How to start/stop the server?
In this project, we are using Postman to start or stop the server. 
Following are the steps to start/stop the server ->

1.) Create a new collection in the Postman for a given collection. Give a name to this collection accordingly.
![Screenshot (42)](https://user-images.githubusercontent.com/60281103/189513655-c7ae390b-965f-4851-bd63-c7d6235845e6.png)



2.) Add a new request to the collection. Give a name to this request accordingly.
![Screenshot (43)](https://user-images.githubusercontent.com/60281103/189513670-219f8777-8c91-4384-a0df-ac5df8d4ca92.png)



4.) Then, select the API type from various choices like DELETE, GET, PUT or etc. -
![Screenshot (45)](https://user-images.githubusercontent.com/60281103/189513841-8d2264b6-beda-41d1-8b27-c9f5dae5e674.png)



3.) For example, in order to insert a new record in the table company for the POST API, we can insert a JSON record in the Body section of the Postman like this -
![Screenshot (44)](https://user-images.githubusercontent.com/60281103/189513822-ef8a9b35-69f3-4597-ac87-5629bc060c97.png)



4.)Then enter the URL in the 'Enter Request URL' section. Here, the URL is "http://localhost:8080/company"-
![Screenshot (47)](https://user-images.githubusercontent.com/60281103/189513922-f74d3c50-3bca-4c42-84ff-ac53feceec1c.png)



5.) And then click on Send to start the server -
![image](https://user-images.githubusercontent.com/60281103/189513984-954603cf-20a7-46c4-a7aa-66f00bf6fcd5.png)



6.) Then, in the response, you can see the message returned if it's correct otherwise you'll get an error. Like here, we are getting the message as 'Added company with id: 1009' -
![Screenshot (49)](https://user-images.githubusercontent.com/60281103/189514046-860a5cf9-40ae-4282-82aa-d2b5918f876a.png)



## JSON Test Cases
Here, MongoDB is used as Database for storing and retrieving the details. We have created a database called as taskdb which consists of two collections company and employee. And we are using POST and GET APIs for the two collections to store and retrieve the details.


### For the company table, the JSON test cases used for the following APIs are -

1.) POST API
![Screenshot (50)](https://user-images.githubusercontent.com/60281103/189514276-1ec64b6f-c2a7-4461-a43d-f39da439d222.png)



2.) GET API
![Screenshot (51)](https://user-images.githubusercontent.com/60281103/189514301-f022cd18-c471-445a-8487-3725333511b2.png)


### For the employee table, the JSON test cases used for the following APIs are - 

1.) POST API
![Screenshot (52)](https://user-images.githubusercontent.com/60281103/189514349-c71503eb-a5cd-4ee5-a449-13a73224d14b.png)


2.)GET API
![image](https://user-images.githubusercontent.com/60281103/189514364-6464a62b-6528-4bcd-ac25-d34ff5b20fd8.png)


## Collections in MongoDB

### company
![Screenshot (54)](https://user-images.githubusercontent.com/60281103/189514387-2566e45f-6107-4242-bed1-673f58c68b27.png)


### employee
![Screenshot (55)](https://user-images.githubusercontent.com/60281103/189514401-9d0db12e-3e82-4fcb-b413-668493c23c3c.png)







