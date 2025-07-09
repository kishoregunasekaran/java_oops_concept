# 📚 Library Book Manager in Java

## 🚀 My First OOPs Java Project

This is my first Java program where I applied the **Object-Oriented Programming (OOPs)** concepts I started learning today.  
I created this project to understand and implement the concepts of **class**, **object**, **array of objects**, and **methods** in Java.

---

## 🧠 What I Learned

- ✅ How to define a class and its attributes.
- ✅ How to create objects using constructors.
- ✅ How to use arrays to store multiple objects.
- ✅ How to encapsulate logic inside service classes.
- ✅ How to fetch data based on user input using conditional logic and loops.

---

## 💡 Project Overview

This program simulates a **Library Book Manager**, where:

1. **Users can add multiple books** by providing:
   - Serial Number
   - Book Name
   - Author Name
   - Rate

2. The entered books are stored in an **array of Book objects**.

3. All books are displayed using a loop that calls the `display()` method of each object.

4. The user is then given an option to **fetch/search for books** by:
   - Serial Number
   - Book Name
   - Author Name
   - Rate

The search will go through each book and display matching records using the `equalsIgnoreCase()` method for string matching and direct comparison for numbers.

---

## 🧱 Program Structure

### 🔹 `Book` Class
Represents a book with:
- `serial_number`, `book_name`, `author`, `rate`
- A constructor to initialize values
- A `display()` method to print book details

### 🔹 `LibraryService` Class
Handles:
- Taking user input and creating `Book[]` using the `AddingBooks()` method
- Displaying all books using the `displayAll()` method

### 🔹 `FetchBook` Class
Allows:
- Searching for books by various fields using the `FetchDetails()` method
- Uses a `switch-case` to handle user search choices

### 🔹 `Main` Class
Runs the program:
- Calls `AddingBooks()` to get input
- Displays all books
- Allows user to search books using `FetchDetails()`

---


