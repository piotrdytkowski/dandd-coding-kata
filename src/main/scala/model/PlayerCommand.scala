package model

abstract sealed class PlayerCommand
case class Turn(direction: Direction) extends PlayerCommand
case class MovePlayer() extends PlayerCommand
