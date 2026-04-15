package mx.uv.eyrc.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.uv.eyrc.inventario.entity.Producto;

public interface ProductRepository extends JpaRepository<Producto, Long>{
    
}
