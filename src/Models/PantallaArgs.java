package Models;

import org.bukkit.entity.Player;
import java.util.*;

public class PantallaArgs {
	public String[] args;
	public static final String[] listaComandos = {
		"/AutoRestart opcion1",
		"/AutoRestart opcion2",
		"/AutoRestart opcion3",
		"/AutoRestart opcion4",
		"/AutoRestart opcion5",
		"/AutoRestart opcion6",
		"/AutoRestart opcion7",
		"/AutoRestart opcion8",
		"/AutoRestart opcion9",
		"/AutoRestart opcion10"
	};
	public static final String[] descripciones = {
		"Descripci�n 1",
		"Descripci�n 2",
		"Descripci�n 3",
		"Descripci�n 4",
		"Descripci�n 5",
		"Descripci�n 6",
		"Descripci�n 7",
		"Descripci�n 8",
		"Descripci�n 9",
		"Descripci�n 10",
	};
	
	public PantallaArgs(String[] args) {
		this.args = args;
	}
};
