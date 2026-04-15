package mx.uv.eyrc.inventario.service; // Sugiero cambiar .repository por .service

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import mx.uv.eyrc.inventario.entity.Producto;
import mx.uv.eyrc.inventario.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductoService {
    
    // LA CLAVE: Debe ser 'final' para que @RequiredArgsConstructor lo inyecte
    private final ProductRepository repository;

    public List<Producto> ListarTodos(){
        return repository.findAll();    
    }

    public Optional<Producto> BuscarPorId(Long id){
        return repository.findById(id);
    }

    public Producto Guardar(Producto producto){
        return repository.save(producto);
    }

    public void Eliminar(Long id){
        repository.deleteById(id);
    }
}