package model.meta;

public interface CheckedOutMssgs {
    void accept(CheckedOutMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CheckedOutDOWNMssgs extends CartStateDOWNMssgs, CheckedOutMssgs{}
interface CheckedOutUPMssgs extends Mssgs, CheckedOutMssgs{}
