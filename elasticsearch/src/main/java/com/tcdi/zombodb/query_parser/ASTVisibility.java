/* Generated By:JJTree: Do not edit this line. ASTVisibility.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.tcdi.zombodb.query_parser;

public
class ASTVisibility extends com.tcdi.zombodb.query_parser.QueryParserNode {
  public ASTVisibility(int id) {
    super(id);
  }

  public ASTVisibility(QueryParser p, int id) {
    super(p, id);
  }


  public long getXmin() {
    return Long.valueOf(getChild(0).getEscapedValue());
  }

  public long getXmax() {
    return Long.valueOf(getChild(1).getEscapedValue());
  }

  public long[] getActiveXids() {
    ASTArray array = (ASTArray) getChild(2);
    if (array == null)
      return null;
    long[] xids = new long[array.jjtGetNumChildren()];

    int i=0;
    for (QueryParserNode node : array) {
      xids[i++] = Long.valueOf(node.getEscapedValue());
    }
    return xids;
  }


  /** Accept the visitor. **/
  public Object jjtAccept(QueryParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d4186ca42690fbc2abf65ea33a5d1709 (do not edit this line) */
