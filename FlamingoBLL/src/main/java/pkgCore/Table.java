package pkgCore;

import java.util.HashMap;
import java.util.UUID;
import pkgCore.Player;
public class Table {

	private UUID TableID;
	private HashMap<UUID, Player> PlayersInTable = new HashMap<UUID, Player>(); 
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		PlayersInTable.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		PlayersInTable.remove(p.getPlayerID());
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		return PlayersInTable.get(p.getPlayerID());
	}
}
