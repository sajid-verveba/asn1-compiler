/* Generated By:JJTree: Do not edit this line. ASTCompoundValue.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTCompoundValue extends SimpleNode {
  public ASTCompoundValue(int id) {
    super(id);
  }

  public ASTCompoundValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f9e5f3badeb68e7e30e895a2036be88d (do not edit this line) */
