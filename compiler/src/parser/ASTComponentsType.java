/* Generated By:JJTree: Do not edit this line. ASTComponentsType.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTComponentsType extends SimpleNode {
  public ASTComponentsType(int id) {
    super(id);
  }

  public ASTComponentsType(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=61f1a5acddfc8d93f26d86762b531566 (do not edit this line) */