package br.com.ecommerce.admin.ecommerceadmin.model.fornecedor;


import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Fornecedor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

}
