package br.com.ecommerce.admin.ecommerceadmin.bean.produto;

import br.com.ecommerce.admin.ecommerceadmin.bean.BaseManageBean;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import br.com.ecommerce.admin.ecommerceadmin.repo.ProdutoRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;

@Component
@RequestScope
public class ProdutoManageBean extends BaseManageBean {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Getter
    @Setter
    private List<Produto> listaProdutos;

    @PostConstruct
    public void init(){
        listaProdutos = produtoRepository.findAll();
        System.out.println("teste");
    }

}
