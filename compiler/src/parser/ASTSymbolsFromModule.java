/* Generated By:JJTree: Do not edit this line. ASTSymbolsFromModule.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTSymbolsFromModule extends SimpleNode {
  public ASTSymbolsFromModule(int id) {
    super(id);
  }

  public ASTSymbolsFromModule(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=543c4965c0238e00158c4a37313c88b0 (do not edit this line) */
