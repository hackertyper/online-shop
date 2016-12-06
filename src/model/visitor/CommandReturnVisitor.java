
package model.visitor;

public interface CommandReturnVisitor<R> extends CartManagerCommandReturnVisitor<R> ,CustomerManagerCommandReturnVisitor<R> ,NewlyAddedCommandReturnVisitor<R> ,OrderManagerCommandReturnVisitor<R> ,ShopManagerCommandReturnVisitor<R> ,ShopkeeperCommandReturnVisitor<R> {
    
    
}
