package model

sealed abstract class Direction
case class Left() extends Direction
case class Right() extends Direction