package exercises

fun calculateTotalTasks(completed: Int, pending: Int): Int {
    return completed + pending
}

fun main() {

    val completedTasks = 4
    val pendingTasks = 6

    val totalTasks = calculateTotalTasks(
        completedTasks,
        pendingTasks
    )

    println("Total tasks: $totalTasks")
}