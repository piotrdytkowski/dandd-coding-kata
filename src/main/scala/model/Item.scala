package model

sealed abstract class Item

case class Bone() extends Item
case class Scroll() extends Item
case class Coin() extends Item

//Other way, no warns on pattern matching
object OtherItemType extends Enumeration {
  val OtherBone, OtherScroll, OtherCoin = Value
}

object Example {
  val item: Item = Bone()
  item match {
    case Bone() => "Bone"
    case Scroll() => "Scroll"
    case Coin() => "Coin"
  }

  val otherItem = OtherItemType.OtherBone
  otherItem match {
    case OtherItemType.OtherBone => "OtherBone"
  }
}