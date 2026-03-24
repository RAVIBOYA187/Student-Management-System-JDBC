# 🎓 Student Management System (JDBC-Based)

A **console-based Student Management System** built using **Java, JDBC, and MySQL**, designed with separate modules for **Admin and Student operations**.
The application provides secure login, account management, and complete CRUD functionality with a well-structured modular design.

---

## 🚀 Features

### 👨‍💼 Admin Module

* Admin Login
* View all students
* Fetch students using ID / Email
* Update student marks
* Delete student records
* Access admin-specific operations

### 🎓 Student Module

* Student Registration
* Login using Email & Password / OTP
* View student details
* Update profile (Name, Email, Contact, Password)
* Delete own account

### ⚙️ General Features

* Full CRUD operations using JDBC
* Secure SQL execution using PreparedStatement
* Menu-driven console interface
* Modular and scalable code structure

---

## 🛠️ Tech Stack

* **Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **Tools:** VS Code / Eclipse, Git, GitHub

---

## 🧠 Key Concepts Used

* JDBC (Connection, PreparedStatement, ResultSet)
* CRUD Operations
* Object-Oriented Programming (OOP)
* Exception Handling
* Modular Design (Separation of Concerns)
* Authentication & User Management

---

## 📂 Project Structure

```id="struc123"
Student_Management/
│
├── src/
│   ├── Admin/
│   │   ├── AdminLogin.java
│   │   ├── AdminFeatures.java
│   │   ├── AdminOptions.java
│   │   ├── DeleteStudentsByIds.java
│   │   ├── EditMarks.java
│   │   ├── FetchStudentsUsingEmails.java
│   │   ├── FetchStudentsUsingIds.java
│   │   ├── ViewAllStudentsByAdmin.java
│   │   └── HomePage.java
│   │
│   ├── Student_Management/
│   │   ├── CreateStudentAccount.java
│   │   ├── StudentLoginFeatures.java
│   │   ├── LoginWithEmailPassword.java
│   │   ├── LoginWithContactOTP.java
│   │   ├── ViewStudentDetails.java
│   │   ├── EditNameByStudent.java
│   │   ├── EditEmail.java
│   │   ├── EditContact.java
│   │   ├── EditPassword.java
│   │   ├── DeleteDetailsByStudent.java
│   │   └── StudentMenu.java
│   │
│   └── Student_Management_Driver/
│       └── Student_Management_Driver.java
│
├── README.md
└── .gitignore
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```id="clone123"
git clone https://github.com/your-username/Student-Management-System-JDBC.git
cd Student-Management-System-JDBC
```

---

### 2️⃣ Configure MySQL Database

Create database:

```sql id="db123"
CREATE DATABASE student_management;
```

Create table:

```sql id="table123"
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    contact VARCHAR(15),
    password VARCHAR(100),
    marks INT
);
```

---

### 3️⃣ Update Database Credentials

Update your DB connection file:

```java id="dbcode123"
String url = "jdbc:mysql://localhost:3306/student_management";
String user = "root";
String password = "your_password";
```

---

### 4️⃣ Run the Application

* Run `Student_Management_Driver.java`
* Choose:

  * Admin Login
  * Student Login / Registration

---

## 📸 Sample Output

*(Add screenshots here for better presentation)*

---

## 📈 Future Enhancements

* 🌐 Convert into Web Application (Servlets + JSP)
* 🔐 Implement role-based authentication
* 📊 Add AI-based student performance prediction
* 📱 Build REST APIs for frontend integration

---

## 💡 What I Learned

* Real-time usage of **JDBC for database operations**
* Designing **modular applications with multiple user roles**
* Implementing **authentication systems (Login/OTP)**
* Writing optimized and secure SQL queries

---
