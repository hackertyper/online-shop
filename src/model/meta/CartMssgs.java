package model.meta;

public interface CartMssgs {
    void accept(CartMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CartDOWNMssgs extends Mssgs, CartMssgs{}
interface CartUPMssgs extends Mssgs, CartMssgs{}
