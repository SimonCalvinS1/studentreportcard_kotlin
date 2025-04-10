import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val teachers = mutableListOf<Teacher>() //teacher list
    println("Enter login details for 2 teachers:")
    for (i in 1..2) {
        println("\nTeacher $i:")
        print("Enter username: ")
        val username = sc.nextLine()
        print("Enter password: ")
        val password = sc.nextLine()
        teachers.add(Teacher(username, password))
    }
    println("\nEnter number of students (between 1 to 10) : ")
    var num_ofStudents = sc.nextInt()
    sc.nextLine()
    while (num_ofStudents !in 1..10) {
        println("Please enter a number between 1 to 10: ")
        num_ofStudents = sc.nextInt()
    }
    val stu_WithMarks = mutableListOf<Pair<Student, Marks>>() //list of student with marks
    val usedRollNumbers = mutableSetOf<Int>() //set of already existing roll numbers
    for(i in 1..num_ofStudents) {
        println("\nEnter details for Student $i : ")
        print("Enter student name : ")
        val name = sc.nextLine()
        var roll: Int
        while(true) {
            print("Enter roll number: ")
            roll = sc.nextInt()
            sc.nextLine()
            if(roll in usedRollNumbers) {
                println("Roll number already used, enter a new roll number")
            }
            else {
                usedRollNumbers.add(roll)
                break
            }
        }
        fun getValidMark(subject: String): Int {
            var mark: Int
            while(true) {
                print("Enter marks for $subject (1-100): ")
                mark = sc.nextInt()
                if (mark in 1..100) { return mark }
                else { println("Invalid marks. Must be between 1 and 100.") }
            }
        }
        val subject1 = getValidMark("subject 1") //mark validations
        val subject2 = getValidMark("subject 2")
        val subject3 = getValidMark("subject 3")
        val subject4 = getValidMark("subject 4")
        val subject5 = getValidMark("subject 5")
        sc.nextLine()
        val stu = Student(name, roll)
        val mark = Marks(subject1, subject2, subject3, subject4, subject5)
        stu_WithMarks.add(Pair(stu, mark))
    }
    while(true) {
        println("\n----Student Report Card Manager----")
        println("1) Display report card using roll number")
        println("2) Display all report cards (for teachers)")
        println("3) Exit")
        print("\nEnter your choice : ")
        val choice = sc.nextInt()
        when (choice) {
            1 -> {
                print("Enter the roll number of the student : ")
                val rollNumber = sc.nextInt()
                val student = stu_WithMarks.find { it.first.rollNo == rollNumber } //finding in list
                if (student != null) {
                    val reportCard = ReportCard(student.first, student.second)
                    reportCard.createReport()
                }
                else { println("Student with Roll Number $rollNumber not found.") }
            }
            2 -> {
                println("Message : Teacher login required")
                sc.nextLine()
                print("Username : ")
                val username = sc.nextLine()
                print("Password : ")
                val password = sc.nextLine()
                val isValidTeacher = teachers.any { it.login(username, password) }
                if(isValidTeacher) { //display all report cards only when verified as a teacher
                    for(studentWithMarks in stu_WithMarks) {
                        val reportCard = ReportCard(studentWithMarks.first, studentWithMarks.second)
                        reportCard.createReport()
                    }
                }
                else { println("Invalid login credentials, access denied") }
            }
            3 -> {
                println("Exiting")
                break
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}