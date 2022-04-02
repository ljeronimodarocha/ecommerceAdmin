package br.com.ecommerce.admin.ecommerceadmin.bean.produto;

import br.com.ecommerce.admin.ecommerceadmin.bean.BaseManageBean;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import br.com.ecommerce.admin.ecommerceadmin.repo.ProdutoRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@RequestScope
public class LstProdutoManageBean extends BaseManageBean {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Getter
    @Setter
    private Produto selectProduto;

    @Getter
    @Setter
    private List<Produto> listaProdutos;

    @Getter
    @Setter
    private List<Produto> produtosFiltrados;

    @PostConstruct
    public void init() {
        listaProdutos = produtoRepository.findAll();
    }

}
