/* Generated By:JJTree: Do not edit this line. ASTObjectIdentifierValue.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTObjectIdentifierValue extends SimpleNode {
  public ASTObjectIdentifierValue(int id) {
    super(id);
  }

  public ASTObjectIdentifierValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4d9ab959d95d64cae749c0b4dc367c25 (do not edit this line) */
