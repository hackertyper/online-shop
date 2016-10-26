package model.meta;

public interface CustomerManagerMssgs {
    void accept(CustomerManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerManagerDOWNMssgs extends Mssgs, CustomerManagerMssgs{}
interface CustomerManagerUPMssgs extends Mssgs, CustomerManagerMssgs{}
