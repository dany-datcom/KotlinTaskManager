# Kotlin Task Manager

## Overview

Kotlin Task Manager is a console-based application developed in Kotlin. The application allows users to create and view tasks through a simple command-line menu.

The main purpose of this project is to demonstrate fundamental Kotlin programming concepts, including variables, expressions, conditionals, loops, functions, classes, and collections.

The project was created as part of the CSE 310 Applied Programming course to learn and practice the Kotlin programming language.

## Features

The application currently provides the following functionality:

* Create a new task.
* List all existing tasks.
* Assign an ID to each task.
* Store a task title and description.
* Assign a priority to each task.
* Track the task status.
* Display a menu for interacting with the application.
* Handle invalid menu options.
* Exit the application.

## Technologies Used

* Kotlin
* IntelliJ IDEA
* Java Development Kit (JDK)
* JVM

## Kotlin Concepts Demonstrated

This project demonstrates several fundamental Kotlin concepts.

### Variables

The application uses both immutable (`val`) and mutable (`var`) variables.

For example, task properties such as the title and description are stored in variables, while the application uses a mutable variable to control whether the main menu continues running.

### Expressions

Expressions are used to perform operations and calculate values within the application.

For example, the application calculates a new task ID based on the number of tasks currently stored.

### Conditionals

The application uses `if` statements and `when` expressions to make decisions.

The `when` expression is used to process the user's menu selection, while `if` statements are used to determine whether tasks exist before displaying them.

### Loops

The application uses loops to control the menu and display multiple tasks.

A `while` loop keeps the main menu running until the user chooses to exit. A `for` loop is used to display each task stored in the collection.

### Functions

Functions are used to organize the application into smaller, reusable pieces.

Examples include:

* `createTask()`
* `listTasks()`
* `addTask()`
* `getTasks()`
* `createTask()` in the `TaskManager` class

Using functions makes the code easier to understand and maintain.

### Classes

The project uses two main classes:

* `Task`
* `TaskManager`

The `Task` class represents an individual task and stores its information.

The `TaskManager` class manages the collection of tasks and provides functionality for adding and retrieving them.

### Collections

The application uses a mutable list to store tasks:

```kotlin
private val tasks = mutableListOf<Task>()
```

This collection allows new tasks to be added while the program is running and allows the application to retrieve and display the stored tasks.

## Project Structure

```text
KotlinTaskManager
│
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

The `exercises` package contains small Kotlin exercises created while learning the language.

The `taskmanager` package contains the actual Task Manager application.

## How to Run

### Requirements

Before running the project, make sure the following are installed:

* Java Development Kit (JDK)
* IntelliJ IDEA
* Kotlin support for IntelliJ IDEA

### Running the Application

1. Open the project in IntelliJ IDEA.
2. Navigate to:

```text
src/main/kotlin/taskmanager/Main.kt
```

3. Run the `main()` function.
4. Use the menu displayed in the console.

The application provides the following options:

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

Listing tasks:

```text
--- Tasks ---

ID: 1
Title: Complete Kotlin assignment
Description: Finish the Task Manager project
Priority: High
Status: Pending
```

## What I Learned

While developing this project, I learned how Kotlin uses object-oriented programming together with features such as mutable and immutable variables, collections, functions, conditionals, and loops.

One of the most useful parts of the project was learning how to organize a program using classes. The `Task` class is responsible for representing task information, while the `TaskManager` class is responsible for managing the tasks.

I also learned how Kotlin can be used to build interactive console applications that process user input and respond to different choices.

## Video Demonstration

The video demonstrates the execution of the Task Manager application and provides a walkthrough of the code and the Kotlin concepts used in the project.

**Video:** TODO - Add YouTube video link

## Future Improvements

Future versions of the application could include additional task management functionality such as:

* Updating existing tasks.
* Deleting tasks.
* Searching for tasks.
* Marking tasks as completed.
* Validating user input.
* Saving tasks to a file or database.

These features are possible extensions of the current project as I continue learning Kotlin.

## Author

Dany Josue Jimenez
