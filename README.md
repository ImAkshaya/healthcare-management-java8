# Healthcare Management System (Java 8 + Spring Boot)

## 📌 Overview
This is a backend **Healthcare Management System** built using **Java 8 and Spring Boot**.  
Instead of using a database, patient data is stored and read from a **CSV file**.  
The application exposes REST APIs that can be tested using **Postman**.

This project is created for **backend portfolio demonstration** and interview preparation.

---

## 🏗 Project Architecture

healthcare-management-java8
├── pom.xml
└── src
└── main
├── java
│ └── com.example.healthcare
│ ├── HealthcareApplication.java
│ ├── controller
│ │ └── PatientController.java
│ ├── service
│ │ └── PatientService.java
│ └── model
│ └── Patient.java
└── resources
└── patients.csv


---

## 🛠 Tech Stack
- Java 8
- Spring Boot
- Spring Web (REST APIs)
- Maven
- CSV file (as data source)
- Postman (API testing)

---

## 📄 CSV File (Data Source)

**Location:**
src/main/resources/patients.csv


**Sample Data:**
```csv
id,name,age,gender,disease
1,Anita,45,Female,Diabetes
2,Rahul,30,Male,Asthma
The CSV file is loaded using Spring Boot classpath.

🔁 Application Flow
Postman Request
   ↓
PatientController
   ↓
PatientService
   ↓
CSV File Read
   ↓
JSON Response


🚀 How to Run the Application
1️⃣ Clone the Repository
git clone https://github.com/<your-username>/healthcare-management-java8.git
cd healthcare-management-java8
2️⃣ Build the Project
mvn clean install
3️⃣ Run the Application
mvn spring-boot:run
Application will start at:

http://localhost:8080
🧪 API Testing (Using Postman)
✅ Get All Patients
Endpoint:

GET http://localhost:8080/patients
Response:

[
  {
    "id": 1,
    "name": "Anita",
    "age": 45,
    "gender": "Female",
    "disease": "Diabetes"
  }
]
📸 Postman screenshots are added in the portfolio (Notion).
