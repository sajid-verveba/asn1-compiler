/* Generated By:JJTree: Do not edit this line. ASTElementType.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public class ASTElementType extends SimpleNode {

   public ASTElementType(int id) {
      super(id);
   }

   public ASTElementType(AsnParser p, int id) {
      super(p, id);
   }

   public void setOptional(boolean optional) {
   }

   /** Accept the visitor. **/
   public Object jjtAccept(AsnParserVisitor visitor, Object data) {
      return visitor.visit(this, data);
   }
}
/* JavaCC - OriginalChecksum=e083ee04c2b63d1b8d433b5fb69e7c2d (do not edit this line) */
