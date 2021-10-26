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
		"Descripción 1",
		"Descripción 2",
		"Descripción 3",
		"Descripción 4",
		"Descripción 5",
		"Descripción 6",
		"Descripción 7",
		"Descripción 8",
		"Descripción 9",
		"Descripción 10",
	};
	
	public PantallaArgs(String[] args) {
		this.args = args;
	}
};
