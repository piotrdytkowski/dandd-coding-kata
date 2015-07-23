package model

sealed abstract class ResultMessage
case class Success(cell: Cell) extends ResultMessage
case class Failure(message: String) extends ResultMessage
