package model.meta;

public interface CartManagerMssgs {
    void accept(CartManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CartManagerDOWNMssgs extends Mssgs, CartManagerMssgs{}
interface CartManagerUPMssgs extends Mssgs, CartManagerMssgs{}
