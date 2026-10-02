
package taskmanager

/**
 * Represents a task in the Task Manager application.
 *
 * Each task contains an ID, title, description, priority, and status.
 */
class Task(
    val id: Int,
    var title: String,
    var description: String,
    var priority: String,
    var status: String = "Pending"
)

