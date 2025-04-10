# Student Report Card Manager

A simple Kotlin command-line application that manages student report cards with support for teacher login authentication.
---

# Tech Stack

- Language: Kotlin (JVM-based)
- Compiler: Kotlin Command Line Compiler (kotlinc)
- Runtime: Java Virtual Machine (JVM)
- IDE (optional): IntelliJ IDEA / VS Code with Kotlin plugin / Android Studio
- Version Control: Git & GitHub

---

# Prerequisites

To compile or run this project, you need :
- Java Development Kit (JDK) – Version 8 or higher 
- Kotlin Compiler (kotlinc)

To verify installations: java -version, javac -version, kotlinc -version

---

# Features and Functionalities

These .kt files use the concepts of data classes, functions, classes, constructors, while and for loops, collections: (mutableListOf() and mutableSetOf()), if-else blocks and when blocks

The functionalities of this kotlin project include :
- Add up to 10 students with marks in 5 subjects
- Prevents duplicate roll numbers
- Validates that marks are within 1–100
- View a single student's report card by roll number
- Teacher login required to view all report cards
- Built using Kotlin and standard I/O

---

# Compile the Main.kt file
kotlinc Main.kt Student.kt Marks.kt ReportCard.kt Teacher.kt Principal.kt -include-runtime -d Main.jar

# Run the Main.kt file after its compilation
java -jar Main.jar

---
