package mx.uv.eyrc.inventario;

import mx.uv.eyrc.inventario.entity.Producto;
import mx.uv.eyrc.inventario.repository.ProductRepository; // Asegúrate de importar esto
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
	// LA CLAVE: Pasa 'ProductRepository repository' como argumento aquí
	CommandLineRunner init(ProductRepository repository) {
		return args -> {
			repository.save(new Producto(null, "Laptop Dell", "i7 16RAM", 15500.0, 5, "Electrónica", null));
			repository.save(new Producto(null, "Mouse", "inalambrico", 250.0, 50, "Accesorios", null));
			repository.save(new Producto(null, "Audifonos", "Sonido envolvente", 600.0, 22, "Accesorios", null));
			
			System.out.println("Base de datos inicializada con éxito.");
		};
	}
}