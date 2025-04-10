class ReportCard(private val s: Student, private val m: Marks) {
    fun createReport() {
        println("-----Student Report Card-----")
        s.displayDetails()
        println("- - - - - - - - - - - - - - -")
        m.displayMarks()
        println("=============================\n")
    }
}