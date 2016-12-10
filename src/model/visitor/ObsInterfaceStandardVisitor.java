
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException{
        this.standardHandling(customerOrderArticleList);
    }
    public void handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException{
        this.standardHandling(quantifiedArticlesArticle);
    }
    public void handlePreOrderArticleList(PersistentPreOrderArticleList preOrderArticleList) throws PersistenceException{
        this.standardHandling(preOrderArticleList);
    }
    public void handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException{
        this.standardHandling(cartManagerOnDelivery);
    }
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException{
        this.standardHandling(cartManagerArticleList);
    }
    public void handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException{
        this.standardHandling(cartManagerStandardDelivery);
    }
    public void handleShopkeeperBasicProductGroup(PersistentShopkeeperBasicProductGroup shopkeeperBasicProductGroup) throws PersistenceException{
        this.standardHandling(shopkeeperBasicProductGroup);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
