package taskmanager

class TaskManager {

    private val tasks = mutableListOf<Task>()

    /**
     * Adds an existing task to the task collection.
     *
     * @param task the task to add to the collection.
     */
    fun addTask(task: Task) {
        tasks.add(task)
    }

    /**
     * Returns all tasks currently stored in the task collection.
     *
     * @return a list containing all stored tasks.
     */
    fun getTasks(): List<Task> {
        return tasks
    }

    /**
     * Creates a new task and adds it to the task collection.
     *
     * The task ID is generated based on the current number of tasks.
     *
     * @param title the title of the new task.
     * @param description the description of the new task.
     * @param priority the priority level of the new task.
     */
    fun createTask(
        title: String,
        description: String,
        priority: String
    ) {
        val newId = tasks.size + 1

        val task = Task(
            id = newId,
            title = title,
            description = description,
            priority = priority
        )

        tasks.add(task)
    }
}
