# People-Data-Management-Solution  
  
  
## Purpose of Application:  
- This microservice-based application can be used by companies and organizations, both small and big, to keep track of employee data like the departments the employees work in, as well as any internal organizations they might belong to.  
- The project also provides a clean UI to interact with on the front-end side and efficiently manage employee tasks.  
  
<hr>  

## Features:  
- This project provides an all-in-one data management solution for any individual or organization to use efficiently. The current solutions in the market usually utilize different services and softwares for different tasks, sometimes leading to problems across multiple services.
- Many existing projects use monolithic architectural patterns to provide a range of services leading to software crashes and bugs being introduced resulting in an unpleasant user experience. This application uses a distributed microservices-based architecture and is capable of supporting multiple instances of its services thereby improving availability, resilience, and fault tolerance.  
- The current architecture of this project allows internal service configurations to be stored in an external config repository, thus reducing the load on the service itself and also ensuring that the application remains dependency-free. Users no longer have to worry about messing up internal configs or service modifications slowing their tasks.  
- Another factor that reduces the load on services as well as provides an additional security layer is the introduction of an API gateway. Whenever an external client interacts with a service by sending a request, the request is first analyzed by the gateway and then routed to the required service. This ensures the conservation of resources for the other services, thus providing efficiency and efficacy.  
- This application also provides up-to-date logs for the requests made to different services by utilizing Spring Cloud Sleuth for distributed tracing.  
  
<hr>  
  
## Architecture:  
  
![microservices_architecture](https://github.com/AdwaitKulkarni58/Company-Management-Application/assets/65598707/0def0c95-dfdb-40c0-9e8b-a3a0b296fd51)  
  
<hr>  
  
## Libraries, frameworks, and technologies used:  
- Spring Boot & Java (Back-end framework)  
- Maven (Build tool)  
- React.js (Front-end client)  
- Spring Cloud Netflix Eureka Client (Service registration)  
- Spring Cloud Netflix Eureka Server (Service registration)  
- Spring Cloud Gateway (API Gateway)  
- Spring Doc OpenAPI (Swagger documentation)  
- Spring Boot Starter Actuator (Monitor operational information)  
- MySQL DB (SQL database)  
- JPA (Data persistence API)  

<hr>  
  
## Steps to run:  
  
### Requirements:  
  - [JDK 17](https://www.oracle.com/ca-en/java/technologies/downloads/#java17)  
  - [Maven](https://maven.apache.org/)  
    
### Running the application:  
  - There are several ways to run a Spring Boot application on your local machine. One way is to execute all the main methods in the service and config classes from your IDE.  
  - Alternatively, you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins.html#build-tool-plugins.maven) to run your application.  
  - Build the project using clean install and then run it.  
  ```shell
  mvn clean install
  ```  
  ```shell
  mvn spring-boot:run
  ```  
  - The application would run on [localhost](http://localhost:8080) on the default Spring Boot Tomcat server.  
    
  <hr>  
    
  ## Copyright:  
  - Released under the Apache License 2.0. See the [LICENSE](https://github.com/AdwaitKulkarni58/company-management-application/blob/master/LICENSE) file.
