package model

sealed abstract class ItemType

case class Bone() extends ItemType
case class Scroll() extends ItemType
case class Coin() extends ItemType
