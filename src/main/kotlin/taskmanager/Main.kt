
package taskmanager

/**
 * Runs the Task Manager application and displays the main menu.
 * The menu continues running until the user chooses to exit.
 */
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

/**
 * Prompts the user for task information and creates a new task.
 *
 * @param taskManager the TaskManager used to store the new task.
 */
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

/**
 * Retrieves and displays all tasks stored in the TaskManager.
 * If there are no tasks, a message is displayed instead.
 *
 * @param taskManager the TaskManager containing the tasks to display.
 */
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
