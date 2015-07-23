package model

trait PlayerInteractions {
  def invoke(playerCommand: PlayerCommand): (ResultMessage, Game)
}
