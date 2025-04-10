# Student Report Card Manager

A simple Kotlin command-line application that manages student report cards with support for teacher login authentication.
---

# Features

- Add up to 10 students with marks in 5 subjects
- Prevents duplicate roll numbers
- Validates that marks are within 1–100
- View a single student's report card by roll number
- Teacher login required to view all report cards
- Built using Kotlin and standard I/O

---

# Compile the Main.kt file
kotlinc Main.kt Student.kt Marks.kt ReportCard.kt Teacher.kt -include-runtime -d Main.jar

# Run the Main.kt file after its compilation
java -jar Main.jar

---
