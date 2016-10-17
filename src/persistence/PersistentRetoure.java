package persistence;


public interface PersistentRetoure extends PersistentDelivery, Retoure4Public {
    
    public Retoure_ArticleListProxi getArticleList() throws PersistenceException ;
    public PersistentRetoure getThis() throws PersistenceException ;
    
    

}

