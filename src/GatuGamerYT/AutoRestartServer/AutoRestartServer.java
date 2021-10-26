package GatuGamerYT.AutoRestartServer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import GatuGamerYT.AutoRestartServer.comandos.ComandoAyuda;

public class AutoRestartServer extends JavaPlugin{
	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String nombre = ChatColor.GREEN+"["+pdffile.getName()+"]"; //[AutoRestartServer] Verde
	
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA+"<-------------------------------------->");
		Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.GOLD+" Ha sido activado! ("+ChatColor.LIGHT_PURPLE+"Version: "+ChatColor.BLUE+version+ChatColor.GOLD+")");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"[Gracias por utilizar mi plugin]"+ChatColor.DARK_PURPLE+" =D!");
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA+"<-------------------------------------->");
		RegistrarComandos();
	}
	
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.GOLD+" Ha sido desactivado! ("+ChatColor.LIGHT_PURPLE+"Version: "+ChatColor.BLUE+version+ChatColor.GOLD+")");
	}
	
	public void RegistrarComandos(){
		this.getCommand("AutoRestart").setExecutor(new ComandoAyuda(this));
	}
} 
