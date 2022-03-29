package br.com.ecommerce.admin.ecommerceadmin.model.fornecedor;


import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;

import javax.persistence.*;

@Entity
public class Fornecedor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String cnpj;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    private Produto produto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
