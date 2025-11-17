Event Management System — Java Project

This is a Java-based Event Management System built using OOP concepts, JDBC, and a structured database. The project allows users to manage events, participants, and registrations in an organized way.

---- Features

Add, update, delete, and view events

Manage participants/attendees

Register participants for events

Database-backed storage using JDBC

Modular Java classes following OOP principles

----Technologies Used

Java (Core + OOP)

JDBC

MySQL / PostgreSQL (depending on your setup)

DAO Pattern for database operations

---- Project Structure
src/
 ├── model/        # Event, Participant, Registration classes
 ├── dao/          # Database Access Objects (CRUD)
 ├── util/         # DB connection setup
 └── main/         # Main application files

---- Database Structure

Tables include:

events

participants

registrations

Contains relationships such as:

One event → Many registrations

One participant → Many registrations

----How to Run

Import the project into any Java IDE (IntelliJ, Eclipse, VS Code).

Update your database credentials in the DB connection file.

Run the SQL script (if provided) to create the tables.

Execute the Main class to launch the system.

---- Concepts Implemented

Object-Oriented Programming

Encapsulation & Inheritance

JDBC connection & queries

Prepared statements to prevent SQL injection

Modular design (DAO pattern)

---- Requirements

Java JDK (8 or later)

MySQL / PostgreSQL

JDBC driver

---- How to Use the System

Add new events

Add participants

Register participants for events

View all events and registrations

---- Future Enhancements

GUI with Java Swing / JavaFX

Login system (Admin/User)

Event analytics dashboard

Email/SMS notifications

📎 GitHub Repository

Make sure your repository contains:

src/ folder with all Java files

README.md (this file)

