package br.com.ecommerce.admin.ecommerceadmin.model.categoria;

import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;

import javax.persistence.*;

@Entity
public class Categoria extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @ManyToOne
    private Produto produto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
