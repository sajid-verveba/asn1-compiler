/* Generated By:JJTree: Do not edit this line. ASTSubtypeValueSet.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTSubtypeValueSet extends SimpleNode {
  public ASTSubtypeValueSet(int id) {
    super(id);
  }

  public ASTSubtypeValueSet(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5ba8c944b0a19b0c9a476e7683926dfe (do not edit this line) */
