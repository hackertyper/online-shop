
package model.visitor;

public interface CommandVisitor extends ArticleCommandVisitor,CartManagerCommandVisitor,CustomerManagerCommandVisitor,ItemCommandVisitor,NewlyAddedCommandVisitor,OrderManagerCommandVisitor,ShopManagerCommandVisitor{
    
    
}
