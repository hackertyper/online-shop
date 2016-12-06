
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException{
        this.standardHandling(customerOrderArticleList);
    }
    public void handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException{
        this.standardHandling(shopManagerItemRange);
    }
    public void handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException{
        this.standardHandling(quantifiedArticlesArticle);
    }
    public void handleProductGroupItemList(PersistentProductGroupItemList productGroupItemList) throws PersistenceException{
        this.standardHandling(productGroupItemList);
    }
    public void handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException{
        this.standardHandling(cartManagerOnDelivery);
    }
    public void handleShopkeeperItemRange(PersistentShopkeeperItemRange shopkeeperItemRange) throws PersistenceException{
        this.standardHandling(shopkeeperItemRange);
    }
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException{
        this.standardHandling(cartManagerArticleList);
    }
    public void handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException{
        this.standardHandling(cartManagerStandardDelivery);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
