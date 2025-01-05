# Election Candidate Information Management System (ECI)

This project is a **practice activity** developed during an academy session to understand and apply concepts of modular architecture and CRUD operations using Java. The system allows users to manage and retrieve information about election candidates stored in a MySQL database.

---

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Execution](#setup-and-execution)
- [Modules](#modules)
  - [Entity](#entity)
  - [DAO](#dao)
  - [Service](#service)
  - [Controller](#controller)
  - [Client](#client)
- [Acknowledgments](#acknowledgments)

---

## Introduction
The **Election Candidate Information Management System (ECI)** is designed to retrieve and filter information about candidates participating in elections. This project demonstrates the use of layered architecture to separate concerns between data access, service logic, and user interface.

---

## Features
1. Retrieve all candidates.
2. Filter candidates by:
   - Party
   - Assembly Constituency
   - State and Party
   - Gender
   - Age (above a specified limit)

---

## Technologies Used
- **Java**: Programming language
- **MySQL**: Relational Database Management System
- **JDBC**: Java Database Connectivity for database operations
- **Eclipse/IntelliJ IDEA**: IDE for Java development

---

## Project Structure
The project uses a layered architecture:
- **Entity Layer**: Represents the data model.
- **DAO (Data Access Object) Layer**: Handles database interaction.
- **Service Layer**: Contains business logic.
- **Controller Layer**: Acts as an intermediary between the service layer and the client.
- **Client Layer**: Provides the user interface.

### Directory Structure
```
com.tka.eci
   |-- client      // Contains ECIclient.java
   |-- controller  // Contains ECIcontroller.java
   |-- dao         // Contains ECAdao.java
   |-- entity      // Contains Candidate.java
   |-- service     // Contains ECIservice.java
```

---

## Setup and Execution
1. **Database Setup**:
   - Install and configure MySQL.
   - Create a database `advjava193`.
   - Use the `candidate` table schema:
     ```sql
     CREATE TABLE candidate (
         cid INT PRIMARY KEY,
         name VARCHAR(50),
         party VARCHAR(50),
         state VARCHAR(50),
         assembly VARCHAR(50),
         assembly_no INT,
         status VARCHAR(50),
         gender VARCHAR(10),
         age INT
     );
     ```
   - Populate the table with sample data.

2. **Run the Project**:
   - Configure the JDBC driver in your IDE.
   - Ensure `path`, `url`, `uname`, and `pwd` are correct in `ECAdao.java`.
   - Run the `ECIclient.java` file.

---

## Modules

### Entity
The `Candidate` class models a candidate entity with properties like `name`, `party`, `state`, `gender`, etc.

**Key Methods**:
- Getters and Setters
- `toString()` for readable output

### DAO (Data Access Object)
`ECAdao.java` handles database connectivity and retrieval of candidate data.

**Key Methods**:
- `allCandidate()`: Fetches all records from the database.

### Service
`ECIservice.java` implements the core logic for filtering candidates.

**Key Methods**:
- `listByParty(String party)`
- `listByAssembly(String assembly)`
- `listByStateParty(String state, String party)`
- `listByGender(String gender)`
- `listByAge(int age)`

### Controller
`ECIcontroller.java` serves as an intermediary between the client and the service layer.

**Key Methods**:
- Calls service methods for various operations.

### Client
`ECIclient.java` provides the user interface for testing the system.

**Key Actions**:
- Invokes controller methods.
- Displays filtered lists of candidates.

---

## Acknowledgments
This project is part of a hands-on activity to enhance understanding of:
- Modular programming in Java.
- Database operations using JDBC.
- Layered architecture design.

Special thanks to the academy for guiding us through the process!

