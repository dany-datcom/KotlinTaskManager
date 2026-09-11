package taskmanager

class Task(
    val id: Int,
    var title: String,
    var description: String,
    var priority: String,
    var status: String = "Pending"
)