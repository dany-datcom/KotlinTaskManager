# Kotlin Task Manager

## Overview

Kotlin Task Manager is a console application I created for the CSE 310 Applied Programming course while learning Kotlin.

The program allows the user to create tasks and view the tasks that have been created. I built the application to practice basic Kotlin programming and object-oriented programming.

## Features

* Create a new task
* Give each task an ID
* Add a title and description
* Select a priority
* Store the task status
* List existing tasks
* Use a simple console menu
* Handle invalid menu selections
* Exit the program

## Technologies Used

* Kotlin
* IntelliJ IDEA
* JDK
* JVM

## What I Practiced

While working on this project, I practiced several Kotlin concepts:

* `val` and `var` variables
* Expressions
* `if` statements
* `when` expressions
* `while` and `for` loops
* Functions
* Classes
* Mutable lists

The project uses two main classes, `Task` and `TaskManager`. The `Task` class stores information about a task, while `TaskManager` keeps the tasks in a mutable list and provides methods to work with them.

For example, the task list is stored using:

```kotlin
private val tasks = mutableListOf<Task>()
```

I also used a `while` loop to keep the menu running until the user chooses to exit and a `for` loop to display the tasks.

## Project Structure

```text
KotlinTaskManager
├── src
│   └── main
│       └── kotlin
│           ├── exercises
│           │   ├── Variables.kt
│           │   ├── Expressions.kt
│           │   ├── Conditionals.kt
│           │   ├── WhenExample.kt
│           │   ├── Loops.kt
│           │   └── Functions.kt
│           │
│           └── taskmanager
│               ├── Task.kt
│               ├── TaskManager.kt
│               └── Main.kt
│
└── README.md
```

The `exercises` folder contains the smaller exercises I used while learning Kotlin. The `taskmanager` folder contains the application itself.

## How to Run

### Requirements

* JDK
* IntelliJ IDEA
* Kotlin support in IntelliJ IDEA

### Steps

1. Open the project in IntelliJ IDEA.
2. Open `src/main/kotlin/taskmanager/Main.kt`.
3. Run the `main()` function.
4. Use the options shown in the console.

The menu contains:

```text
1. Create Task
2. List Tasks
3. Exit
```

### Example

Creating a task:

```text
--- Create Task ---

Task title: Complete Kotlin assignment
Task description: Finish the Task Manager project
Task priority (High/Medium/Low): High

Task created successfully!
```

Listing a task:

```text
--- Tasks ---

ID: 1
Title: Complete Kotlin assignment
Description: Finish the Task Manager project
Priority: High
Status: Pending
```

## What I Learned

This project helped me understand how Kotlin is organized and how classes can be used to separate responsibilities in a program.

I learned how to create classes, store objects in a mutable list, work with user input, and use loops and conditionals to control a console application.

I also became more comfortable reading Kotlin syntax and organizing a small project into different files.

## Video Demonstration

The video demonstrates the Task Manager running and shows the main parts of the project.

[Watch the project demonstration](https://app.screencastify.com/watch/4IfLTymaTllcCRvAQGpH)

## Future Improvements

If I continue working on this project, I would like to add:

* Update existing tasks
* Delete tasks
* Search for tasks
* Mark tasks as completed
* Better input validation
* Save tasks to a file

## Author

Dany Josue Jimenez

