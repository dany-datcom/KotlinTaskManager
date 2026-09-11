package exercises

fun main() {

    val taskTitle = "Complete Kotlin assignment"
    val taskDescription = "Finish the Week 1 Task Manager project"

    var taskPriority = "High"
    var taskCompleted = false

    println("Task: $taskTitle")
    println("Description: $taskDescription")
    println("Priority: $taskPriority")
    println("Completed: $taskCompleted")

    taskPriority = "Medium"
    taskCompleted = true

    println()
    println("Updated Task")
    println("Priority: $taskPriority")
    println("Completed: $taskCompleted")
}