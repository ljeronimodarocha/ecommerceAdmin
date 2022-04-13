package br.com.ecommerce.admin.ecommerceadmin.model.fornecedor;


import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Fornecedor extends BaseEntity {

    @Column(nullable = false, length = 45)
    private String cnpj;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    private Produto produto;

}
