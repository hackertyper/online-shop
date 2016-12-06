
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException, E;
    public R handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException, E;
    public R handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException, E;
    public R handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException, E;
    public R handlePreOrderArticleList(PersistentPreOrderArticleList preOrderArticleList) throws PersistenceException, E;
    public R handleProductGroupItemList(PersistentProductGroupItemList productGroupItemList) throws PersistenceException, E;
    public R handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException, E;
    public R handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException, E;
    public R handleShopkeeperItemRange(PersistentShopkeeperItemRange shopkeeperItemRange) throws PersistenceException, E;
    
}
