package br.com.ecommerce.admin.ecommerceadmin.bean.convert;

import br.com.ecommerce.admin.ecommerceadmin.model.BaseEntity;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import java.util.Map;


public
@Component(value = "entityConverter")
class EntityConverter implements Converter {


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value == null || !value.matches("\\d+"))
            return null;
        return this.getAttributesFrom(uiComponent).get(value);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value != null && !value.equals("")) {
            BaseEntity entity = (BaseEntity) value;
            if (entity.getId() != null) {
                this.addAttribute(uiComponent, entity);
                return entity.getId().toString();
            }
        }
        return null;
    }

    private Map<String, Object> getAttributesFrom(UIComponent component) {
        return component.getAttributes();
    }

    private void addAttribute(UIComponent component, BaseEntity entity) {
        this.getAttributesFrom(component).put(entity.getId().toString(), entity);
    }
}
