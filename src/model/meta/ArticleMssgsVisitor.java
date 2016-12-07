package model.meta;

public interface ArticleMssgsVisitor extends ArticleDOWNMssgsVisitor, ArticleUPMssgsVisitor {}


interface ArticleDOWNMssgsVisitor  {

    public void handleArticleChangePriceIntegerMssg(ArticleChangePriceIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleDeleteReserveIntegerMssg(ArticleDeleteReserveIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReceiveDeliveryIntegerMssg(ArticleReceiveDeliveryIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReserveIntegerMssg(ArticleReserveIntegerMssg event) throws persistence.PersistenceException;
    
}


interface ArticleUPMssgsVisitor extends ItemUPMssgsVisitor {

    public void handleArticleChangePriceIntegerMssg(ArticleChangePriceIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleDeleteReserveIntegerMssg(ArticleDeleteReserveIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReceiveDeliveryIntegerMssg(ArticleReceiveDeliveryIntegerMssg event) throws persistence.PersistenceException;
    public void handleArticleReserveIntegerMssg(ArticleReserveIntegerMssg event) throws persistence.PersistenceException;
    
}
