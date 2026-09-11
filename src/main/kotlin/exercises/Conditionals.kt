package exercises

fun main() {

    val taskPriority = "High"
    val taskCompleted = true

    if (taskCompleted) {
        println("The task is completed.")
    } else {
        println("The task is still pending.")
    }

    if (taskPriority == "High") {
        println("This task has high priority.")
    } else {
        println("This task does not have high priority.")
    }
}