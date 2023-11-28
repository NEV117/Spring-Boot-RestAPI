# 🍃 Srping Boot | REST API | Java | Back-end | 

---

This project is a simple rest api made in spring boot, the goal of this project is to be hosted in render to be able to properly consume the apis from a url

UPDATE: The project has been successfully deployed on Render. It utilizes a PostgreSQL database and functions through the following endpoint: https://nev-spring-boot-restapi.onrender.com/api/

Please note that the free Render plan stops the service when it's not in use, so the first request may take some time.

The categories and transactions endpoints are protected and require a bearer token to obtain results.

Please don't break it.

---
## Endpoints:

### Login:

login (POST) returns jwt token
```
https://nev-spring-boot-restapi.onrender.com/api/users/login
```

json format example:
```
{
    "email": "test2@mail",
    "password": "test123456"
}
```

### Register:

login (POST) returns jwt token
```
https://nev-spring-boot-restapi.onrender.com/api/users/register
```

json format example:
```
{
    "firstName": "TEST3",
    "lastName": "lastName3",
    "email": "test3@mail.com",
    "password": "test123456"
}
```

### Categories:

Get All (GET) and Create (POST)
```
https://nev-spring-boot-restapi.onrender.com/api/categories
```
Update (PUT), Get One (GET) and Delete (DELTE)
```
https://nev-spring-boot-restapi.onrender.com/api/categories/:ID
```
json format example:
```
{
    "title": "Tech",
    "description": "Successfully deployed the backend in render"
}
```
### Transactions:

Get All (GET) and Create (POST)
```
https://nev-spring-boot-restapi.onrender.com/api/categories/:categorieID/transactions
```
Update (PUT), Get One (GET) and Delete (DELTE)
```
https://nev-spring-boot-restapi.onrender.com/api/categories/:categorieID/transactions/:transactionID
```
json format example:
```
{
    "amount": 5000,
    "note": "This month wey protein",
    "transactionDate": 1577817000000
}
```
---
## ⚒ Tecnologies:

- Java
- Spring Boot
- PostgreSQL (render bd)
- Swagger UI
- JWT (Json Web Token)
- Maven

---

## 💾 Database Diagram

<p align="center">
<img  src="readMeImages/Modelo.JPG">
</p>

## 💾 Users with encrypted passwords


<p align="center">
<img src="readMeImages/encryptedPasswords.JPG">
</p>

### test User:


| mail            | password               |
| -------------------|--------------------------|
| test2@mail              |           test123456            |



---

##  Overview
### swagger: https://nev-spring-boot-restapi.onrender.com/swagger-ui/index.html
<p align="center">
<img  src="readMeImages/Swagger.JPG">
</p>


### PostMan:
<p align="center">
<img  src="readMeImages/postMan.JPG">
</p>
---

## 💼  [Linkedin](https://www.linkedin.com/in/nicolas-escandon/)