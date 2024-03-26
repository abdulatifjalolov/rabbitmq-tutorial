
Certainly! Here is a README based on the steps you provided:

RabbitMQ Tutorial
This tutorial will guide you through setting up RabbitMQ using Docker and running a sample project to demonstrate its functionality.

Step 1: Pull the RabbitMQ Docker Image
Pull the RabbitMQ Docker image with management plugin from Docker Hub:
docker pull rabbitmq:3.10.5-management

Step 2: Run the RabbitMQ Docker Container
Run the RabbitMQ Docker container with the following command:
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10.5-management

Step 3: Clone the Sample Project
Clone the sample RabbitMQ project from the GitHub repository:
git clone https://github.com/abdulatifjalolov/rabbitmq-tutorial

Step 4: Run the Sample Project for String Message
Navigate to the cloned project directory and run the project. Publish a string message to RabbitMQ using a POST request to the following endpoint:
POST http://localhost:8080/api/v1/publish?message=helloRabbitMQ

Check the console to see the message received by RabbitMQ.

Step 5: Run the Sample Project for JSON Message
Publish a JSON message to RabbitMQ using a POST request with the following JSON payload to the endpoint:
{
    "id" : 1,
    "username" : "admin",
    "password" : "admin123"
}
Send the POST request to:
POST http://localhost:8080/api/v1/publish-json

Check the console to see the JSON message received by RabbitMQ.
