/* Generated By:JJTree: Do not edit this line. ASTSymbolsImported.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTSymbolsImported extends SimpleNode {
  public ASTSymbolsImported(int id) {
    super(id);
  }

  public ASTSymbolsImported(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=758626784f7cec0c0d763b36bf97240f (do not edit this line) */
