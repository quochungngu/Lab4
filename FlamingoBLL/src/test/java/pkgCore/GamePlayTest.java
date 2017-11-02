package pkgCore;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

public class GamePlayTest {

	@Test
	public void GamePlayTest() {
		
		GamePlayBlackJack BlackJack = new GamePlayBlackJack(pkgEnum.eGameType.BLACKJACK);
		HashMap<UUID,Player> players = new HashMap<UUID, Player>();
		Player player1 = new Player("Shawn",0);
		Player player2 = new Player("Hung", 1);
		players.put(player1.getPlayerID(), player1);
		players.put(player2.getPlayerID(), player2);
		
		BlackJack.AddPlayersToGame(players);
		assertEquals(BlackJack.GetPlayerInGame(player1), player1);
		assertEquals(BlackJack.GetPlayerInGame(player2), player2);
		
		BlackJack.RemovePlayerFromGame(player1);
		BlackJack.RemovePlayerFromGame(player2);
		assertNull(BlackJack.GetPlayerInGame(player1));
		assertNull(BlackJack.GetPlayerInGame(player2));
	}
}
