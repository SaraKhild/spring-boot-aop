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
 
   - Aspect
   - Exception
   - Model
   - Controller
   - Model
   - Service
   - Repository 
   
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

##### :pencil2: `Pointcut that matches all repositories, services, and Web REST endpoints. Method is empty as this is just a Pointcut, the implementations are in the Before advices. The second Before that matche with create employee method with 0 or many args, employee type that match with advice args. The AfterReturning is executed after a join point completes normally, for example, if the method returns without throwing an exception.` 

###### Code :computer:

<br>

![](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/5932b9b1-1862-40a0-88a9-f5f27c0388a8)

<br>

###### Result :star_struck:

<br>

![](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/c0baa5e3-57f4-4a7d-add7-ee8d4e422a61)

---

<br>

##### :pencil2: `Pointcut that matches all repositories, services, and Web REST endpoints. Method is empty as this is just a Pointcut, the implementations are in the Before advices. Around that matches all methods service which logs when a method is entered and exited.` 

###### Code :computer:

<br>

![](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/a3d4a7b2-18d7-4f65-a89a-dc4e49c16f2c)

![](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/ceb208a9-ff27-4245-b40a-f884ff15ddc1)

<br>

###### Result :star_struck:

<br>

![](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/f9c6f29c-407d-406f-956a-88c399eef8e1)

---

<br>

##### :pencil2: `Pointcut that matches all repositories, services, and Web REST endpoints. Method is empty as this is just a Pointcut, the implementations are in the Before advices. Around that matches all methods service which logs when a method is entered and when throwing exception.` 

###### Code :computer:

<br>

![](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/519a3c41-b03f-4cd6-b868-79acd31df43e)

![](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/2fe6dba5-6fcb-4c5b-be66-33008cbc9b32)

<br>

###### Result :star_struck:

<br>

![IMG_1711](https://github.com/SaraKhild/spring-boot-aop/assets/67427643/39f57424-3faa-402b-8e09-ae20bec4e780)
  
---
<br>

### Good Luck <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"> 

