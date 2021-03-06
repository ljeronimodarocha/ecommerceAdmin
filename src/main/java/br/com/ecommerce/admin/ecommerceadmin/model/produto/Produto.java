package br.com.ecommerce.admin.ecommerceadmin.model.produto;

import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.categoria.Categoria;
import br.com.ecommerce.admin.ecommerceadmin.model.fornecedor.Fornecedor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@EqualsAndHashCode
public class Produto extends BaseEntity {

    public Produto(Integer id, BigDecimal preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public Produto() {
        this.categoria = new Categoria();
        this.fornecedor = new Fornecedor();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @Lob
    private byte[] imagem;

    @Override
    public int hashCode() {
        return (id == null) ? 0 : id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Produto) {
            return ((Produto) obj).getId().equals(this.id);
        }
        return false;
    }

}
