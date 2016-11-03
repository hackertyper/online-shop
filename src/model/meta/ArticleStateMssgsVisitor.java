package model.meta;

public interface ArticleStateMssgsVisitor extends ArticleStateDOWNMssgsVisitor, ArticleStateUPMssgsVisitor {}


interface ArticleStateDOWNMssgsVisitor extends OfferedFSaleDOWNMssgsVisitor, NewlyAddedDOWNMssgsVisitor, RemovedFSaleDOWNMssgsVisitor {

    
}


interface ArticleStateUPMssgsVisitor  {

    
}
