package model

sealed abstract class Cell
case class Blocked() extends Cell
case class Empty() extends Cell
case class ContainsItem(item: Item) extends Cell
