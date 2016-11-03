package model.meta;

public interface CartStateMssgs {
    void accept(CartStateMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CartStateDOWNMssgs extends Mssgs, CartStateMssgs{}
interface CartStateUPMssgs extends OpenCartUPMssgs, CheckedOutUPMssgs, CartStateMssgs{}
