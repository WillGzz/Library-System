# Library System

## Overview

This project is a library management system implemented in Java. It demonstrates Object-Oriented Programming (OOP) principles and adheres to SOLID design principles. The system manages books, members, and loans, providing functionalities for adding items, loaning and returning items, and searching the catalog.

## Features

- **LibraryItem**: Abstract class representing a generic library item.
- **Loanable**: Interface for loanable items.
- **Book**: Class representing a book, inheriting from `LibraryItem` and implementing `Loanable`.
- **Member**: Class representing a library member.
- **Loan**: Class representing a loan transaction.
- **Library**: Class managing the collection of items and members, and handling loan and return transactions.
- **Catalog**: Class managing the search functionality for library items.

## SOLID Principles

- **Single Responsibility Principle (SRP)**: Each class has a single responsibility.
- **Open/Closed Principle (OCP)**: Classes are open for extension but closed for modification.
- **Liskov Substitution Principle (LSP)**: Subtypes can replace their base types.
- **Interface Segregation Principle (ISP)**: Interfaces are specific to the needs of the client.
- **Dependency Inversion Principle (DIP)**: High-level modules depend on abstractions.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor of your choice

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/library-system.git
   
2. Navigate to the project directory:
   ```cd LibrarySystem```

### Running the Application

1. Compile the Java files:

```javac -d bin src/LibrarySystem/*.java```

2. Run the application:

 ```java -cp bin LibrarySystem.Main```
