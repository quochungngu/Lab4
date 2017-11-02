package pkgCore;

import org.junit.Test;
import static org.junit.Assert.*;

public class TableTest {

	@Test
	public void TableTest() {
		Table table = new Table();
		Player player1 = new Player("Shawn", 0);
		Player player2 = new Player("Hung", 1);
		
		table.AddPlayerToTable(player1);
		table.AddPlayerToTable(player2);
		
		assertEquals(table.GetPlayerFromTable(player1), player1);
		assertEquals(table.GetPlayerFromTable(player2), player2);
		
		
		table.RemovePlayerFromTable(player1);
		assertNull(table.GetPlayerFromTable(player1));
	}
}
