# Stack & Queue Implementations (Array and Linked List)

This project implements **stack and queue data structures** in Java using both **array-based** and **linked-list–based** approaches. All core data structures are implemented **from scratch**, without using Java’s built-in `Stack`, `Queue`, or `LinkedList` classes, to demonstrate a deep understanding of underlying data structure mechanics.

The program provides a **menu-driven console interface** that allows users to interactively add, remove, and inspect data across multiple stack and queue implementations.

---

## ✨ Features
- Stack implementation using an array
- Stack implementation using a linked list
- Queue implementation using a circular array
- Queue implementation using a linked list
- Custom linked list and node implementation
- Menu-driven interface for interactive testing
- Ability to compare behavior across implementations

---

## 🛠️ Technologies Used
- Java
- Object-Oriented Programming
- Custom data structure implementations

---

## 📁 Project Structure
```bash
.
├── StackQueueDemo.java      # Main program (menu-driven interface)
├── StackArray.java          # Stack implemented using an array
├── StackList.java           # Stack implemented using a linked list
├── QueueArray.java          # Circular queue implemented using an array
├── QueueList.java           # Queue implemented using a linked list
├── Node.java                # Node implementation for linked lists
├── SampleData.java          # Sample data generator
└── README.md
```

## 🧠 Design Notes
- No built-in stack, queue, or linked list data types are used
- Linked lists are implemented manually using a custom Node class
- The array-based queue uses a circular buffer to optimize space
- This design enables direct comparison of:
  - Memory usage patterns
  - Insertion/removal behavior
  - Structural differences between implementations

🧪 Build & Run
Compile all files:
```bash
javac *.java
```

Run the program:
```bash
java StackQueueDemo
```

## 📜 License

This project is licensed under the MIT License. See the LICENSE file for details.

---

## 👤 Author
Hannah G. Simon
