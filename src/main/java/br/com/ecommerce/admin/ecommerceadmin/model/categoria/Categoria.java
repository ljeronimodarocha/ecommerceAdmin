package br.com.ecommerce.admin.ecommerceadmin.model.categoria;

import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Categoria extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String nome;

    @ManyToOne
    private Produto produto;

    @Override
    public String toString() {
        return nome;
    }
}
