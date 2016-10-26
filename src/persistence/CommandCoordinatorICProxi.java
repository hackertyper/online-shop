package persistence;



import model.visitor.*;

public class CommandCoordinatorICProxi extends PersistentInCacheProxi implements PersistentCommandCoordinator{
    
    public CommandCoordinatorICProxi(long objectId) {
        super(objectId);
    }
    public CommandCoordinatorICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCommandCoordinatorFacade
            .getCommandCoordinator(this.getId());
    }
    
    public long getClassId() {
        return -117;
    }
    
    public CommandCoordinator_ExecuterProxi getExecuter() throws PersistenceException {
        return ((PersistentCommandCoordinator)this.getTheObject()).getExecuter();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCommandCoordinator(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCommandCoordinator(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCommandCoordinator(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCommandCoordinator(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCommandCoordinator)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void coordinate(final Command command) 
				throws PersistenceException{
        ((PersistentCommandCoordinator)this.getTheObject()).coordinate(command);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCommandCoordinator)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCommandCoordinator)this.getTheObject()).initializeOnInstantiation();
    }
    public void interrupt() 
				throws PersistenceException{
        ((PersistentCommandCoordinator)this.getTheObject()).interrupt();
    }
    public void restart() 
				throws PersistenceException{
        ((PersistentCommandCoordinator)this.getTheObject()).restart();
    }

    
}
