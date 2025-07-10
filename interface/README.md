# 💳 Payment System in Java

## 🚀 Interface-Based Java Project

This is a Java program that demonstrates the concept of **Interfaces** in **Object-Oriented Programming (OOPs)**.  
It simulates a **Payment System** where different payment methods like **Google Pay**, **PayPal**, and **UPI** are implemented using a common interface.

---

## 🧠 What I Learned

- ✅ How to define and implement a **Java interface**
- ✅ How to enforce a **common method structure** across unrelated classes
- ✅ How **interfaces promote code reusability and flexibility**
- ✅ How to implement **runtime polymorphism** using interface references

---

## 💡 Project Overview

The user can choose a **payment method** from:

- Google Pay  
- PayPal  
- UPI  

Each method requires:

- Password authentication  
- Amount input  
- Transaction success message  

All payment types follow the same **interface-based structure**.

---

## 🧱 Program Structure

### 🔹 `Function` (Interface)

Defines the structure for all payment types.

**Methods:**

- `getPassword()` – takes user input for password  
- `authentication()` – checks if the entered password is valid  
- `proceedPayment(int amount)` – processes the transaction  
- `successMessage(int amount)` – displays a success message  

---

### 🔹 `GooglePay`, `PayPal`, and `UPI` Classes

Each class implements the `Function` interface.

**Responsibilities:**

- Provide specific behavior for `getPassword()`, `authentication()`, `proceedPayment()`, and `successMessage()`  
- Maintain their own password logic and user prompts  

---

### 🔹 `Main` Class

**Flow of Execution:**

1. Ask the user to choose a payment method  
2. Dynamically assign the chosen class to an interface reference (`Function`)  
3. Perform password authentication  
4. If valid, proceed with the transaction and display the success message  

---

## 🔍 Interface Highlights

- The `Function` interface ensures that **all payment methods implement the same set of operations**
- Helps achieve **loose coupling** — code in `Main` does not depend on specific class names
- Enables **runtime polymorphism** — the exact class is chosen based on user input

---
