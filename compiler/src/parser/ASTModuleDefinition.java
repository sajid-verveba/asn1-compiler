/* Generated By:JJTree: Do not edit this line. ASTModuleDefinition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTModuleDefinition extends SimpleNode {
  public ASTModuleDefinition(int id) {
    super(id);
  }

  public ASTModuleDefinition(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ad0db5da5fe90430cafad9ce896a028e (do not edit this line) */
