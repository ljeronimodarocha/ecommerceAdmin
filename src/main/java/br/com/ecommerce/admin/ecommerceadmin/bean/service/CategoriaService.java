package br.com.ecommerce.admin.ecommerceadmin.bean.service;

import br.com.ecommerce.admin.ecommerceadmin.model.categoria.Categoria;
import br.com.ecommerce.admin.ecommerceadmin.repo.CategoriaRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(WebApplicationContext.SCOPE_APPLICATION)
public class CategoriaService {
    
    private CategoriaRepository catDAO;

    public Categoria buscaPeloID(Integer id) {
        return catDAO.findById(id).orElse(null);
    }
}
