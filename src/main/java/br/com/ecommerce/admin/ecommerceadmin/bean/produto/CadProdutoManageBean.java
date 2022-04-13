package br.com.ecommerce.admin.ecommerceadmin.bean.produto;

import br.com.ecommerce.admin.ecommerceadmin.model.categoria.Categoria;
import br.com.ecommerce.admin.ecommerceadmin.model.fornecedor.Fornecedor;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import br.com.ecommerce.admin.ecommerceadmin.repo.CategoriaRepository;
import br.com.ecommerce.admin.ecommerceadmin.repo.FornecedorRepository;
import br.com.ecommerce.admin.ecommerceadmin.repo.ProdutoRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@ViewScoped
public class CadProdutoManageBean {

    @Getter
    @Setter
    private Categoria categoriaSelecionada;

    @Getter
    @Setter
    private Fornecedor fornecedorSelecionado;

    @Getter
    @Setter
    private List<Categoria> listCategoria = new ArrayList<>();
    @Getter
    @Setter
    private List<Fornecedor> listFornecedor = new ArrayList<>();

    @Getter
    @Setter
    private Produto produto;

    @Autowired
    private CategoriaRepository catDAO;

    @Autowired
    private FornecedorRepository forRepo;

    @Autowired
    private ProdutoRepository prodtDAO;

    @PostConstruct
    private void init() {
        listCategoria = catDAO.findAll();
        listFornecedor = forRepo.findAll();
        produto = new Produto();
    }

    public String salvar() {
        try {
            produto.setCategoria(categoriaSelecionada);
            produto.setFornecedor(fornecedorSelecionado);
            prodtDAO.save(produto);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage()));
        }
        return "/?faces-redirect=true";
    }
}
