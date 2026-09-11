package exercises

fun main() {

    val taskPriority = "High"

    when (taskPriority) {
        "High" -> println("Complete this task as soon as possible.")
        "Medium" -> println("Complete this task after high priority tasks.")
        "Low" -> println("This task can be completed later.")
        else -> println("Unknown priority.")
    }
}