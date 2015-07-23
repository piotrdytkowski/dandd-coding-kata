package model

abstract sealed class PlayerCommand(val playerId: Integer)
case class Turn(override val playerId: Integer, direction: Direction) extends PlayerCommand(playerId)
case class MovePlayer(override val playerId: Integer) extends PlayerCommand(playerId)
