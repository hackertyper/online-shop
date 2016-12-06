package model.meta;

public interface ShopkeeperMssgsVisitor extends ShopkeeperDOWNMssgsVisitor, ShopkeeperUPMssgsVisitor {}


interface ShopkeeperDOWNMssgsVisitor  {

    public void handleShopkeeperChangeDescriptionItemStringMssg(ShopkeeperChangeDescriptionItemStringMssg event) throws persistence.PersistenceException;
    public void handleShopkeeperChangePriceArticleIntegerMssg(ShopkeeperChangePriceArticleIntegerMssg event) throws persistence.PersistenceException;
    public void handleShopkeeperChangeProductGroupArticleProductGroupMssg(ShopkeeperChangeProductGroupArticleProductGroupMssg event) throws persistence.PersistenceException;
    public void handleShopkeeperChangeTimeCustomerDeliveryIntegerMssg(ShopkeeperChangeTimeCustomerDeliveryIntegerMssg event) throws persistence.PersistenceException;
    
}


interface ShopkeeperUPMssgsVisitor  {

    public void handleShopkeeperChangeDescriptionItemStringMssg(ShopkeeperChangeDescriptionItemStringMssg event) throws persistence.PersistenceException;
    public void handleShopkeeperChangePriceArticleIntegerMssg(ShopkeeperChangePriceArticleIntegerMssg event) throws persistence.PersistenceException;
    public void handleShopkeeperChangeProductGroupArticleProductGroupMssg(ShopkeeperChangeProductGroupArticleProductGroupMssg event) throws persistence.PersistenceException;
    public void handleShopkeeperChangeTimeCustomerDeliveryIntegerMssg(ShopkeeperChangeTimeCustomerDeliveryIntegerMssg event) throws persistence.PersistenceException;
    
}
