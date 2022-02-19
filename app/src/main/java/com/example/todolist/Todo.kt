package com.example.todolist

// This class will hold data for the item
data class Todo(
    val title: String,
    var isChecked: Boolean = false
)