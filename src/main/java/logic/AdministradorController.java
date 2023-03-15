package logic;

import java.sql.SQLException;
import java.util.LinkedList;
import dataBase.DataAdministradores;
import entities.Administrador;

public class AdministradorController {
	
	private DataAdministradores da;
	
	public AdministradorController() {
		da = new DataAdministradores();
	}

	public Administrador validate(Administrador a) throws SQLException {
		return da.getByUser(a);
	}

	public LinkedList<Administrador> getAll() throws SQLException {
		return da.getAll();
	}

	public void add(Administrador a) throws SQLException {
		da.add(a);
	}

	public Administrador getById(int id) throws SQLException {
		return da.getById(id);
	}

	public void update(Administrador a) throws SQLException {
		da.update(a);
	}

	public void delete(int id) throws SQLException {
		da.delete(id);
	}
	
	public Administrador getByUsername(String username) throws SQLException {
		return da.getByUsername(username);
	}
}
