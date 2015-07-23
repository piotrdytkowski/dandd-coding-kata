package model

trait PlayerInteractions {
  def move(playerId: Integer, playerCommand: PlayerCommand): (Cell, Game)
}
