package model

sealed abstract class Item

case class Bone() extends Item
case class Scroll() extends Item
case class Coin() extends Item
