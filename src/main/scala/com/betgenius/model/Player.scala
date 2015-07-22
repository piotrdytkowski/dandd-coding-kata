package com.betgenius.model

case class Player(id: Integer, inventory: List[Item], location: Coord, orientation: Orientation) {

}
case class Coord(val x: Integer, val y: Integer)