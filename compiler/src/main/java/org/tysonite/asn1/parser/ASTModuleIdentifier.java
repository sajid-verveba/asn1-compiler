/* Generated By:JJTree: Do not edit this line. ASTModuleIdentifier.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTModuleIdentifier extends SimpleNode {
  public ASTModuleIdentifier(int id) {
    super(id);
  }

  public ASTModuleIdentifier(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=39f7e869558931284c7a3fbce752d5c6 (do not edit this line) */