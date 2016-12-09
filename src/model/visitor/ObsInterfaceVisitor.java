
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException;
    public void handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException;
    public void handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException;
    public void handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException;
    public void handlePreOrderArticleList(PersistentPreOrderArticleList preOrderArticleList) throws PersistenceException;
    public void handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException;
    public void handleShopManagerBasicProductGroup(PersistentShopManagerBasicProductGroup shopManagerBasicProductGroup) throws PersistenceException;
    public void handleShopkeeperBasicProductGroup(PersistentShopkeeperBasicProductGroup shopkeeperBasicProductGroup) throws PersistenceException;
    
}
