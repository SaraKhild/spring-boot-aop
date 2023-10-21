# Spring Boot Aop Project
<br>

## Overview
 In this project I implement an Aspect for logging execution for service, controller, and repository Spring components using Spring AOP 
 <br>
 
## Usages
- SpringBoot
- Spring AOP
- Lombok
- MySQL
  
<br> 

## Architecture of the Project

 ### 1-src folder
 
   - Aspect folder
   - Exception
   - Model folder
   - Controller folder
   - Model folder
   - Service folder
   - Repository folder
   
### 2-Maven pom.xml
<br> 
    
```
 <dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-aop</artifactId>
		</dependency>
 </dependencies>
 ```
<br>
 

### 3-Application.Properties

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3312/db
spring.datasource.username=db
spring.datasource.password=nFLhPPKOnkW1FA1e
spring.jpa.show-sql=true

 ```
 ## Let's Start :mechanical_arm:



  
---
<br>

### Good Luck <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"> 

