package taskmanager

fun main() {

    val taskManager = TaskManager()
    var running = true

    while (running) {

        println()
        println("================================")
        println("       KOTLIN TASK MANAGER")
        println("================================")
        println("1. Create Task")
        println("2. List Tasks")
        println("3. Exit")
        println("================================")
        print("Choose an option: ")

        val choice = readln()

        when (choice) {
            "1" -> createTask(taskManager)
            "2" -> listTasks(taskManager)
            "3" -> {
                println("Goodbye!")
                running = false
            }
            else -> println("Invalid option. Please try again.")
        }
    }
}

fun createTask(taskManager: TaskManager) {

    println()
    println("--- Create Task ---")

    print("Task title: ")
    val title = readln()

    print("Task description: ")
    val description = readln()

    print("Task priority (High/Medium/Low): ")
    val priority = readln()

    taskManager.createTask(
        title,
        description,
        priority
    )

    println("Task created successfully!")
}

fun listTasks(taskManager: TaskManager) {

    println()
    println("--- Tasks ---")

    val tasks = taskManager.getTasks()

    if (tasks.isEmpty()) {
        println("No tasks found.")
        return
    }

    for (task in tasks) {
        println()
        println("ID: ${task.id}")
        println("Title: ${task.title}")
        println("Description: ${task.description}")
        println("Priority: ${task.priority}")
        println("Status: ${task.status}")
        println("================================")
    }
}