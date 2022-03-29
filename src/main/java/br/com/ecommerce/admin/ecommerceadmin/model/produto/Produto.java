package br.com.ecommerce.admin.ecommerceadmin.model.produto;

import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.categoria.Categoria;
import br.com.ecommerce.admin.ecommerceadmin.model.fornecedor.Fornecedor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produto extends BaseEntity {

    public Produto(Integer id, BigDecimal preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public Produto() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private String nome;

    @ManyToOne(optional = false)
    private Categoria categoria;

    @ManyToOne(optional = false)
    private Fornecedor fornecedor;

    @Column(name = "estoque", columnDefinition = "integer default 0")
    private Integer quantidadeEstoque;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer estoque) {
        this.quantidadeEstoque = estoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
