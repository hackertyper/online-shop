package model.meta;

public interface ProductGroupMssgs {
    void accept(ProductGroupMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ProductGroupDOWNMssgs extends ItemDOWNMssgs, ProductGroupMssgs{}
interface ProductGroupUPMssgs extends BasicProductGroupUPMssgs, ProductGroupMssgs{}
