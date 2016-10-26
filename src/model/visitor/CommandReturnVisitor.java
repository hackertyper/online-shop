
package model.visitor;

public interface CommandReturnVisitor<R> extends ArticleCommandReturnVisitor<R> ,CustomerManagerCommandReturnVisitor<R> ,ItemCommandReturnVisitor<R> ,NewlyAddedCommandReturnVisitor<R> {
    
    
}
