data class Marks(val subject1: Int, val subject2: Int, val subject3: Int, val subject4: Int, val subject5: Int) {
    fun total(): Int {
        return subject1+subject2+subject3+subject4+subject5
    }
    fun average(): Double {
        return total()/5.0
    }
    fun displayMarks() {
        println("Marks in subject 1 : $subject1")
        println("Marks in subject 2 : $subject2")
        println("Marks in subject 3 : $subject3")
        println("Marks in subject 4 : $subject4")
        println("Marks in subject 5 : $subject5")
        println("\nPercentage : ${"%.2f".format(average())}")
    }
}