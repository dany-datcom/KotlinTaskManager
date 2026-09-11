package taskmanager

class TaskManager {

    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun getTasks(): List<Task> {
        return tasks
    }

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