package GatuGamerYT.AutoRestartServer.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import GatuGamerYT.AutoRestartServer.AutoRestartServer;
import Models.PantallaArgs;

public class ComandoAyuda implements CommandExecutor{
	private AutoRestartServer plugin; 
	
	public ComandoAyuda(AutoRestartServer plugin){
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if(!(sender instanceof Player)){
			Bukkit.getConsoleSender().sendMessage(plugin.nombre+ChatColor.GOLD+" No puedes ejecutar este comando desde la consola");
			return false; 
		}else{
			Player jugador = (Player) sender;
			UtilHelpers pantalla = new UtilHelpers();
			PantallaArgs pantallaArgs = new PantallaArgs(args);
			

			if(args.length > 0){
				if(args[0].equalsIgnoreCase("help")){
					pantalla.Pantalla(pantallaArgs, jugador);
					jugador.sendMessage(ChatColor.YELLOW+"<--------------------[PAGINA 1/2]-------------------->");
					jugador.sendMessage(ChatColor.RED+"                :<----><---->COMANDOS<----><---->:           ");
					jugador.sendMessage(ChatColor.YELLOW+"Usa"+ChatColor.GREEN+" [/AutoRestart Help 2] Para ver mas comandos del PLugin");
					jugador.sendMessage(ChatColor.YELLOW+"Usa"+ChatColor.GREEN+" [/]");
					jugador.sendMessage(ChatColor.YELLOW+"Usa"+ChatColor.GREEN+" [/]");
					jugador.sendMessage(ChatColor.YELLOW+"Usa"+ChatColor.GREEN+" [/]");
					jugador.sendMessage(ChatColor.YELLOW+"Usa"+ChatColor.GREEN+" [/]");
					jugador.sendMessage(ChatColor.YELLOW+"<--------------------------------------------------->");
					return true;
				}else{
					jugador.sendMessage(plugin.nombre+ChatColor.DARK_RED+" Ese comando no existe!");
					return true;
				}
			}else{
				jugador.sendMessage(plugin.nombre+ChatColor.GOLD+" Usa [/AutoRestart Help] Para ver mas comandos del Plugin");
				return true;	
			}
		}
	}
	
	
}