package com.dscoding.tiktaktoe

sealed class GameEvent {
    object ClickPlayAgain: GameEvent()
    data class ClickBoardCell(val cellNo: Int): GameEvent()
}
