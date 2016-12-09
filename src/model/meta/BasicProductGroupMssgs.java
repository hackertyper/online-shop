package model.meta;

public interface BasicProductGroupMssgs {
    void accept(BasicProductGroupMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface BasicProductGroupDOWNMssgs extends ProductGroupDOWNMssgs, BasicProductGroupMssgs{}
interface BasicProductGroupUPMssgs extends Mssgs, BasicProductGroupMssgs{}
