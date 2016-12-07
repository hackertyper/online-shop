
package model.visitor;

import persistence.*;

public interface ObsInterfaceExceptionVisitor<E extends model.UserException> {
    
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException, E;
    public void handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException, E;
    public void handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException, E;
    public void handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException, E;
    public void handlePreOrderArticleList(PersistentPreOrderArticleList preOrderArticleList) throws PersistenceException, E;
    public void handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException, E;
    public void handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException, E;
    public void handleShopkeeperItemRange(PersistentShopkeeperItemRange shopkeeperItemRange) throws PersistenceException, E;
    
}
