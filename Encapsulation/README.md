# 💳 Bank Account Management System (Encapsulation in Java)

This is a simple **Java console application** that simulates a bank account system. It is built using the **core concept of Encapsulation** from Object-Oriented Programming (OOP).

---

## 🧩 Scenario

A user has a bank account that starts with an initial balance of ₹1000. To interact with the account (deposit, withdraw, or check balance), the user must first enter a **secure 5-digit PIN (23456)**. Once authenticated, the user can choose one of the following options:

1. 💰 Deposit money  
2. 💸 Withdraw money  
3. 📊 Check current balance  
4. ❌ Exit the application

The program ensures that the user cannot access or modify the account balance directly, but only through specific public methods — a perfect demonstration of **encapsulation** in Java.

---

## 🔐 Encapsulation: What & Why?

**Encapsulation** means:
- **Hiding the internal data (variables)** of a class from outside access
- Allowing access **only through public methods (getters/setters)**
- It ensures **data protection**, **security**, and **controlled access**

---

## ✅ How Encapsulation is Implemented in This Program

- `balance` and `pin` are declared as `private` in the `BankAccount` class.
- These variables **cannot be accessed directly** from outside the class.
- Access is provided **only through public methods**:
  - `checkPassword(int password)`
  - `deposit(int amount)`
  - `withdraw(int amount)`
  - `display()` (to show current balance)
- This ensures that all operations on `balance` go through **validations** (e.g., positive amount, sufficient funds).

---

## 🛠️ Features

- ☑️ PIN-protected account access
- ☑️ Deposit money with input validation
- ☑️ Withdraw money with balance check
- ☑️ View current balance
- ☑️ User-friendly menu-driven interface
- ☑️ Prevents direct access to sensitive data (via encapsulation)
- ☑️ Exits gracefully when the user selects `exit`

---


---

## 📌 Key Java Concepts Used

- Object-Oriented Programming (OOP)
- Encapsulation
- Access Modifiers (`private`, `public`)
- Method control
- Scanner class (for input)
- Conditional logic & loops

---

## 📚 Conclusion

This project clearly demonstrates **how encapsulation is used in Java** to protect sensitive data like account balance and PIN. By using `private` fields and `public` methods, we ensure:
- Data integrity
- Secure access
- Clean and maintainable code

Such patterns are essential in **real-world applications** like banking systems, where protecting user data is critical.

---

> Made with 💻 by Kishore G.


