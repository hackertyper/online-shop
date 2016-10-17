package model.meta;

public interface ItemMssgs {
    void accept(ItemMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ItemDOWNMssgs extends Mssgs, ItemMssgs{}
interface ItemUPMssgs extends ProductGroupUPMssgs, ArticleUPMssgs, ItemMssgs{}
