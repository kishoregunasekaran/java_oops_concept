# 🍽️ Food Ordering System in Java

## 🚀 Abstraction-Based Java Project

This is a Java program that demonstrates the concept of **Abstraction** in **Object-Oriented Programming (OOPs)**.  
It simulates a **Food Ordering System** where the calculation and payment logic are abstracted using **abstract classes**.

---

## 🧠 What I Learned

- ✅ How to define and use **abstract classes**
- ✅ How to implement **abstract methods** in derived classes
- ✅ How to hide **internal logic** and expose only required methods
- ✅ How **abstraction increases flexibility** and reduces complexity in code

---

## 💡 Project Overview

- Users can **add food items** with:
  - Item Name
  - Quantity
  - Price

- Items are stored in an **array of objects** of class `Fooditem`
- The program calculates and displays the **total bill amount**
- The user can proceed to **payment through UPI**, handled using abstraction

---

## 🧱 Program Structure

### 🔹 `Fooditem` Class

**Represents a single food item.**

**Attributes**:
- `item_name`
- `quantity`
- `price`
- `sum`

**Constructor**: Initializes all attributes and calculates `sum`.

---

### 🔹 `Calculation` (Abstract Class)

**Defines structure for bill calculation.**

**Abstract Methods**:
- `calculationSum(Fooditem[] fooditems)`
- `displayAll(Fooditem[] fooditems)`

---

### 🔹 `CalculationOperation` Class

**Implements the abstract methods from `Calculation`.**

**Responsibilities**:
- Calculate individual item totals and overall sum
- Display all items with details

---

### 🔹 `PaymentProcess` (Abstract Class)

**Provides a base class for payment types.**

**Attribute**:
- `totalAmount`

**Abstract Method**:
- `paymentReceipt()`

**Concrete Method**:
- `successMessage()` – displays success after payment

---

### 🔹 `UPI` Class

**Extends `PaymentProcess`**

**Implements**:
- `paymentReceipt()` – displays UPI payment processing message

---

### 🔹 `AddingFooditems` Class

**Purpose**: Takes user input to create an array of `Fooditem` objects.

**Uses**:
- `Scanner` class for console input

---

### 🔹 `Main` Class

**Flow of Execution**:
- Add food items
- Display all items
- Calculate total bill
- Proceed to payment if user agrees

---

## 🔍 Abstraction Highlights

- `Calculation` and `PaymentProcess` are **abstract classes**
- They **hide implementation details** and allow for future extensibility
- The user interacts only with the **main workflow**, not the internal business logic

