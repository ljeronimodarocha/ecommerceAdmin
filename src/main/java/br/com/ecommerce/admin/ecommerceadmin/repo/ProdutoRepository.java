package br.com.ecommerce.admin.ecommerceadmin.repo;

import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
