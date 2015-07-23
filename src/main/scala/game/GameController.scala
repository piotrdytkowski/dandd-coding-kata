package game

import model._


object GameController {


  def createGrid():Array[Array[Cell]] = {
    Array(
      Array(Empty(), Empty(), ContainsItem(Bone())),
      Array(Empty(), ContainsItem(Scroll()), ContainsItem(Coin())),
      Array(Empty(), Empty(), ContainsItem(Scroll()))
    )
  }

  def createPlayers() :List[Player] = {
    List(
      Player(1, List(), Coord(0, 0), Orientation.North),
      Player(2, List(), Coord(1, 0), Orientation.West)
    )
  }

  var game:Game = new Game(new Grid(createGrid), createPlayers(), InProgress())

}
