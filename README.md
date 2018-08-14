# Spring-Cloud-practice
Code Commit
This Repository explore the options and how to implement and Deploy the spring boot using microservices architecture using projects available under Spring Cloud.
In the repository we have a multi environmnet Limits Microservice taking configuration from a local git repository using a Spring Cloud Config Server. 
I also have a currency exchange service communicating with a database that is called on currency conversion service using Feign REST client. I also use Ribbon client load balancer to balance load between different instances of our microservices. I use Eureka naming server to dynamically distribute calls using our Ribbon.I use Zuul for API gateway and Logging, all our requests will be routed through our Zuul API gateway and Logs will be generated for them. I use sleuth for tracing requests and reponse and Zipkin to view the requests with it's UI. You can go into the individual microservice for more information.
