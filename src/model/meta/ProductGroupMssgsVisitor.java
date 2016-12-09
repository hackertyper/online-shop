package model.meta;

public interface ProductGroupMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ProductGroupUPMssgsVisitor {}


interface ProductGroupDOWNMssgsVisitor  {

    public void handleProductGroupAddItemItemMssg(ProductGroupAddItemItemMssg event) throws persistence.PersistenceException;
    
}


interface ProductGroupUPMssgsVisitor extends ItemUPMssgsVisitor {

    public void handleProductGroupAddItemItemMssg(ProductGroupAddItemItemMssg event) throws persistence.PersistenceException;
    
}
