data class Student(val name: String, val rollNo: Int) {
    fun displayDetails() {
        println("Student Name : $name")
        println("Roll number : $rollNo\n")
    }
}