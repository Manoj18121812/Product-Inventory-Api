# 📦 Product Inventory REST API

A simple and clean REST API built with Spring Boot to manage products in inventory 🛒⚙️. This project is perfect for beginners who want to practice CRUD operations, MySQL integration, and Postman testing.

---

## 🚀 Features

* ➕ Add Product
* 📄 Get All Products
* 🔍 Get Product by ID
* ✏️ Update Product
* ❌ Delete Product

---

## 🛠 Tech Stack

* ☕ **Java**
* 🌱 **Spring Boot**
* 🗄 **MySQL Database**
* 📡 **Spring Data JPA**
* 🧪 **Postman** for API testing

---

## 📦 Spring Initializr Dependencies

### ✔ Required

* Spring Web
* Spring Data JPA
* MySQL Driver

### ✔ Optional (Recommended)

* Lombok
* Spring Boot DevTools

---

## 🔧 Configuration (application.properties)

Setup your MySQL database configuration:

```
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🧪 Postman Testing

### 📸 Testing Screenshots (Add yours)

Include screenshots for:

* Add Product
* Get All Products
* Update Product
* Delete Product

---

### ➤ **Add Product (POST)**

Endpoint:

```
POST http://localhost:8080/api/products
```

Example Body:

```
{
  "name": "Laptop",
  "price": 55000,
  "quantity": 10
}
```

---

### ➤ **Get All Products (GET)**

```
GET http://localhost:8080/api/products
```

---

### ➤ **Update Product (PUT)**

```
PUT http://localhost:8080/api/products/1
```

Example Body:

```
{
  "name": "Gaming Laptop",
  "price": 65000,
  "quantity": 5
}
```

---

### ➤ **Delete Product (DELETE)**

```
DELETE http://localhost:8080/api/products/1
```

---

## ⭐ Show Support

If you like this project, consider giving it a ⭐ on GitHub!

---

## 🙌 Author

**Manoj** — Java & Spring Boot Developer 🚀
