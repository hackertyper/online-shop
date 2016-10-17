package model.meta;

public interface NewlyAddedMssgs {
    void accept(NewlyAddedMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface NewlyAddedDOWNMssgs extends ArticleStateDOWNMssgs, NewlyAddedMssgs{}
interface NewlyAddedUPMssgs extends Mssgs, NewlyAddedMssgs{}
