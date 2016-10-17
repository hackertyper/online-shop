package model.meta;

public interface ArticleMssgs {
    void accept(ArticleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArticleDOWNMssgs extends ItemDOWNMssgs, ArticleMssgs{}
interface ArticleUPMssgs extends Mssgs, ArticleMssgs{}
