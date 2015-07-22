package model

trait Move {
  def move(player: Player, playerCommand: PlayerCommand): (Cell, Game)
}
