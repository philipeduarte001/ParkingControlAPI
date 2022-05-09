<h1>Parking Control API developed by Luiz Philipe</h1>

BACK-END
Devloped using Spring Boot at back-end and some modules:

* Spring MVC;
* Spring Data JPA;
* Spring Validation;

Configure Spring Datasource, JPA, App properties

Open src/main/resources/application.properties

For PostgreSQL:
spring.datasource.url= jdbc:postgresql://localhost:5432/postgres
spring.datasource.username= postgres
spring.datasource.password= 123456
spring.jpa.hibernate.ddl-auto= update

spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

## Run Spring Boot application
ParkingControlApplication

