package game

import model._


object GameController extends Move{


  def createGrid():Array[Array[Item]] = {
    Array(
      Array(Empty(), Empty(), ContainsItem(Bone())),
      Array(Empty(), ContainsItem(Scroll()), ContainsItem(Coin())),
      Array(Empty(), Empty(), ContainsItem(Scroll()))
    )
  }

  var game:Game = new Game(new Grid(createGrid))
  override def move(player: Player, playerCommand: PlayerCommand): (Cell, Game) = {

    ???
  }
}
