package exercises

fun main() {

    val tasks = listOf(
        "Complete Kotlin assignment",
        "Study functions",
        "Practice classes",
        "Build Task Manager"
    )

    for (task in tasks) {
        println("Task: $task")
    }

    println()

    var taskNumber = 1

    while (taskNumber <= 3) {
        println("Processing task $taskNumber")
        taskNumber++
    }
}