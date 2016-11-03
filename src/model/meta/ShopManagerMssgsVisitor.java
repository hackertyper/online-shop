package model.meta;

public interface ShopManagerMssgsVisitor extends ShopManagerDOWNMssgsVisitor, ShopManagerUPMssgsVisitor {}


interface ShopManagerDOWNMssgsVisitor  {

    public void handleShopManagerAddToCartArticleIntegerMssg(ShopManagerAddToCartArticleIntegerMssg event) throws persistence.PersistenceException;
    
}


interface ShopManagerUPMssgsVisitor  {

    public void handleShopManagerAddToCartArticleIntegerMssg(ShopManagerAddToCartArticleIntegerMssg event) throws persistence.PersistenceException;
    
}
