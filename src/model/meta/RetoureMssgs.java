package model.meta;

public interface RetoureMssgs {
    void accept(RetoureMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface RetoureDOWNMssgs extends DeliveryDOWNMssgs, RetoureMssgs{}
interface RetoureUPMssgs extends Mssgs, RetoureMssgs{}
