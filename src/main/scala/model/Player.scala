package model

import model.Orientation.Orientation


case class Player(id: Integer, inventory: List[ItemType], location: Coord, orientation: Orientation)


case class Coord(x: Integer, y: Integer)

