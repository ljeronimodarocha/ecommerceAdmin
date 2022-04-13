package br.com.ecommerce.admin.ecommerceadmin.model.categoria;

import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import br.com.ecommerce.admin.ecommerceadmin.model.produto.Produto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class Categoria extends BaseEntity {

    private String nome;

    @ManyToOne
    private Produto produto;

}
