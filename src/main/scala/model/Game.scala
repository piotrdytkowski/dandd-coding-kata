package model

case class Game(grid: Grid, players: List[Player], status: GameStatus) extends PlayerInteractions {
  override def invoke(playerCommand: PlayerCommand): (ResultMessage, Game) = {
    playerCommand match {
      case MovePlayer() =>
        players.find(p => p.id == playerCommand.playerId) match {
          case Some(player) => movePlayer(player)
          case None => (Failure("Player not found"), this)
        }
      case _ => ???
    }

    def movePlayer(player: Player): (ResultMessage, Game) = {
      val newCell: Cell = player.orientation match {
        case Orientation.North => grid.initGrid(player.location.x)(player.location.y + 1)
      }
      newCell match {
        case Blocked() => (Failure("Cell is blocked"), this)
        case Empty() => {
          val newCoord: Coord = Coord(player.location.x, player.location.y + 1)
          val resultCell = grid.initGrid(newCoord.x)(newCoord.y + 1)
          val newPlayer = player.copy(location = newCoord)
          val newPlayers = players.map(p =>
            if (p.id == player.id) newPlayer
            else p
          )
          (Success(newCell), copy(players = newPlayers))
        }
        case ContainsItem(item) => ???
      }
    }
  }
}
