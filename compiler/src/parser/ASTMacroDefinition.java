/* Generated By:JJTree: Do not edit this line. ASTMacroDefinition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTMacroDefinition extends SimpleNode {
  public ASTMacroDefinition(int id) {
    super(id);
  }

  public ASTMacroDefinition(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d9da39a08fa27505c6a3175b0b2f29cd (do not edit this line) */