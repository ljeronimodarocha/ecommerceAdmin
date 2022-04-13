package br.com.ecommerce.admin.ecommerceadmin.bean.service;

import br.com.ecommerce.admin.ecommerceadmin.model.categoria.Categoria;
import br.com.ecommerce.admin.ecommerceadmin.model.fornecedor.Fornecedor;
import br.com.ecommerce.admin.ecommerceadmin.repo.CategoriaRepository;
import br.com.ecommerce.admin.ecommerceadmin.repo.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(WebApplicationContext.SCOPE_APPLICATION)
public class FornecedorService {

    @Autowired
    private FornecedorRepository forRepo;

    public Fornecedor buscaPeloID(Integer id) {
        return forRepo.findById(id).orElse(null);
    }
}
