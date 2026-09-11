package exercises

fun createtaskMessage(title: String): String {
    return "Task '${title}' has been created successfully."
}

fun taskStatusMessage(completed: Boolean): String {
    return if (completed) {
        "Task is Completed."
    }else{
        "Task is Pending."
    }
}

fun main() {
    val taskTitle = "Complete Kotlin Assigment"
    val tasCompleted = false

    val creationMessage = createtaskMessage(taskTitle)
    val statusMessage = taskStatusMessage(tasCompleted)

    println(creationMessage)
    println(statusMessage)
}