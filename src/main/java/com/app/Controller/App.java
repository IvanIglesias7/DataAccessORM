package com.app.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.DataAccess.ColegioServicioImpl;

public class App {

	public static void main (String[] args) { 
        
		ApplicationContext contextoapp = new ClassPathXmlApplicationContext("context.xml");
		
		ColegioServicioImpl csi = (ColegioServicioImpl) contextoapp.getBean("colegioDAO");
		
		csi.InsertaAlumno();
		
		;
    }

}
