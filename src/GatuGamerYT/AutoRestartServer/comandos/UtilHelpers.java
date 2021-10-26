package GatuGamerYT.AutoRestartServer.comandos;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import Models.PantallaArgs;

import java.util.*;

public class UtilHelpers {

	public void Pantalla(PantallaArgs args, Player jugador) {
		
		String var1;
		int from;
		String currentPage;
		if(args.args.length > 0 && args.args[1].equalsIgnoreCase("2")) {
			var1 = "Version" ;
			currentPage = "2";
			from = 0;
		} else {
			var1 = "Help 2" ;
			from = 4;			
			currentPage = "1";
		}
		
		
		jugador.sendMessage(ChatColor.YELLOW + "<--------------------[PAGINA " + currentPage + "/2]-------------------->");
		jugador.sendMessage(ChatColor.RED+"                :<----><---->COMANDOS<----><---->:           ");
		jugador.sendMessage(ChatColor.YELLOW+"Usa"+ChatColor.GREEN+" [/AutoRestart " + var1 + "] Para ver mas comandos del PLugin");
		for(;from < from + 5; from++) {
			jugador.sendMessage(ChatColor.YELLOW+"Usa"+ChatColor.GREEN+ DrawLine(args.listaComandos[from], args.descripciones[from]));
		}
		jugador.sendMessage(ChatColor.YELLOW+"<--------------------------------------------------->");
 
	}
	
	public String DrawLine(String command, String description ) {
		return "[/" + command + " " + description + "]";		
	}
}
