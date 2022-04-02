package br.com.ecommerce.admin.ecommerceadmin.repo;

import br.com.ecommerce.admin.ecommerceadmin.model.categoria.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
