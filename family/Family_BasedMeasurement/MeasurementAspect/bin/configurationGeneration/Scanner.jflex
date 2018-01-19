package configurationGeneration;

import java_cup.runtime.Symbol;

@SuppressWarnings(value = { "all" })
%%

%cup
%class FeatureModelScanner
%implements FeatureModelSym
%line
%column

%{  
  private Symbol symbol(String name, int sym, String val) {
    return new Symbol(sym, yyline, yycolumn, val);
  }
  private Symbol symbol(String name, int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  
  private void error(String message) {
    throw new RuntimeException(message + " near " + yyline +":" + yycolumn);
  }
%}
%eofval{
    return symbol("EOF", FeatureModelSym.EOF);
%eofval}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n] | .
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}

Identifier = [:jletter:] [:jletterdigit:]*

%%

/* keywords */
<YYINITIAL> "not"                { return symbol("not", FeatureModelSym.NOT); }
<YYINITIAL> "and"                { return symbol("and", FeatureModelSym.AND); }
<YYINITIAL> "or"                 { return symbol("or", FeatureModelSym.OR); }
<YYINITIAL> "xor"                 { return symbol("xor", FeatureModelSym.XOR); }
<YYINITIAL> "implies"                 { return symbol("implies", FeatureModelSym.IMPLIES); }

<YYINITIAL> {
  /* identifiers */ 
  {Identifier}                   { return symbol("ID", FeatureModelSym.IDENTIFIER, yytext()); }
 
  /* literals */

  /* operators */
  "("                           { return symbol("(", FeatureModelSym.OBRACKETS); }
  ")"                           { return symbol(")", FeatureModelSym.CBRACKETS); }


  /* comments */
  {Comment}                      { /* ignore */ }
 
  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }
}

<<EOF>> {return symbol("EOF", FeatureModelSym.EOF); }
/* error fallback */
.|\n                             { error("Illegal character <"+yytext()+">"); }
