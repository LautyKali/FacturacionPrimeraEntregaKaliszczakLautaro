package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Comercio;
import com.coderhouse.models.Producto;

@SpringBootApplication
public class PrimeraEntregaKaliszczakLautaroApplication  implements CommandLineRunner{
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraEntregaKaliszczakLautaroApplication.class, args);
	}
	
	//@Override
	public void run(String... args ) throws Exception{
		try {
			
			Cliente cliente1 = new Cliente("Lautaro","Kaliszczak","lautarokaliszczakb@gmail.com","Av. Rivadavia 5126","+5491135657556"); 
			Producto producto1 = new Producto("Teclado",50.000, 100);
			Comercio comercio1 = new Comercio("Electronica", "Mexx");
			
			dao.createCliente(cliente1);
			dao.createProducto(producto1);
			dao.createComercio(comercio1);
			
		}catch(Exception e) {
			e.printStackTrace(System.err);
			
		}
		
	}
}



