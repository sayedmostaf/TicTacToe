package com.example.tictactoe

sealed class UserAction {
    object PlayAgainButtonClicked : UserAction()
    data class BoardTapped(val cellNO: Int) : UserAction()
}