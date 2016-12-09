
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends ArticleCommandExceptionVisitor<E>,CartManagerCommandExceptionVisitor<E>,CustomerManagerCommandExceptionVisitor<E>,NewlyAddedCommandExceptionVisitor<E>,OrderManagerCommandExceptionVisitor<E>,ShopManagerCommandExceptionVisitor<E>,ShopkeeperCommandExceptionVisitor<E>{
    
    
}
