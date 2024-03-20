RabbitMQ tutorial

1. docker pull  rabbitmq:3.10.5-management
2. docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.10.5-management
3. Clone project from https://github.com/abdulatifjalolov/rabbitmq-tutorial
4. For String POST http://localhost:8080/api/v1/publish?message=helloRabbitMQ and check console
5. For Json
{
    "id" : 1,
    "username" : "admin",
    "password" : "admin123"
}
 POST http://localhost:8080/api/v1/publish-json and check console
