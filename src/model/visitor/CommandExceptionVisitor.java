
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends CartManagerCommandExceptionVisitor<E>,CustomerManagerCommandExceptionVisitor<E>,NewlyAddedCommandExceptionVisitor<E>,OrderManagerCommandExceptionVisitor<E>,ShopManagerCommandExceptionVisitor<E>,ShopkeeperCommandExceptionVisitor<E>{
    
    
}
