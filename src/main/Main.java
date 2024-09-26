package main;

import org.springframework.context.*;
import org.springframework.context.support.*;

import daosImpl.*;

public class Main {

	public static void main(String[] args) {
//		Vamos a crear un contenedor de spring para meterle y pedirle objetos
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		vamos a pedirle al contenedor, que se llama tambien context, un objeto
		
//		Asi pedimos la bean/objeto de id dao de la clase indicada
//		y la guardamos en la referencia/variable de objeto definido
		AnunciosDAOImpl dao = context.getBean("dao", AnunciosDAOImpl.class);
		
		dao.obtenerAnunciosPortada();
//		gracias a spring he evitado tener que crear un objeto cada vez que quiera
//		usarlo, el objeto ya esta en el contenedor de spring y cuando quiera usarlo
//		se lo pido a spring

	}
}
