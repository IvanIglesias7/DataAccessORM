package com.app.DataAccess;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;


public class ColegioServicioImpl implements ColegioServicio {

	private DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public void InsertaAlumno() {
	
		try {
			Connection con = datasource.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO \"Colegio\".alumnos("
					+ "id_alumno, nombre, apellidos)"
					+ "VALUES (DEFAULT, 'Ivan', 'Iglesias');");
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
