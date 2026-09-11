package exercises

fun main() {

    val completedTasks = 4
    val pendingTasks = 6

    val totalTasks = completedTasks + pendingTasks
    val completionPercentage = (completedTasks.toDouble() / totalTasks) * 100

    println("Completed tasks: $completedTasks")
    println("Pending tasks: $pendingTasks")
    println("Total tasks: $totalTasks")
    println("Completion: $completionPercentage%")
}