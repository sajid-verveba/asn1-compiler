/* Generated By:JJTree: Do not edit this line. ASTTagDefault.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTTagDefault extends SimpleNode {
  public ASTTagDefault(int id) {
    super(id);
  }

  public ASTTagDefault(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=120f3b6bab75dc3ae666b65799125b46 (do not edit this line) */
