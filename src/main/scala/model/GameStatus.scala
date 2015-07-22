package model

sealed abstract class GameStatus
case class InProgress() extends GameStatus
case class PlayerWon(player: Player) extends GameStatus
