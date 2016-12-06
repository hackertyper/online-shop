
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends CartManagerCommandReturnExceptionVisitor<R, E> ,CustomerManagerCommandReturnExceptionVisitor<R, E> ,NewlyAddedCommandReturnExceptionVisitor<R, E> ,OrderManagerCommandReturnExceptionVisitor<R, E> ,ShopManagerCommandReturnExceptionVisitor<R, E> ,ShopkeeperCommandReturnExceptionVisitor<R, E> {
    
    
}
