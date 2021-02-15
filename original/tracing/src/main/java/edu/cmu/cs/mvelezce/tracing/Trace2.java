package edu.cmu.cs.mvelezce.tracing;

public class Trace2 {

  public static void main(String[] args) throws InterruptedException {
    boolean A = Boolean.parseBoolean(args[0]);
    foo(A);
  }

  private static void foo(boolean x) {
    int i = moo(x);
    bar(i);
  }

  private static void bar(int i) {
    if (i > 0) {
      //            Thread.sleep(5000);
      System.out.println("5 seconds");
    } else {
      //            Thread.sleep(2000);
      System.out.println("2 seconds");
    }
  }

  private static int moo(boolean x) {
    if (x) {
      return 1;
    }

    return 0;
  }
}


  Data flow
        Context.compileString line 1506-1507
        return compileString(source, null, null, sourceName, lineno, securityDomain);
        from source to source
  Data flow
        Context.compileString line 1517-1519
        return (Script) compileImpl(null, null, source, sourceName, lineno, securityDomain, false, compiler, compilationErrorReporter);
        from source to sourceString
  Data flow
        Context.compileImpl line 2523-2524
        ScriptNode tree = parse(sourceReader, sourceString, sourceName, lineno,
                    compilerEnv, compilationErrorReporter, returnFunction);
        from sourceString to sourceString
  Data flow
        Context.parse line 2577
        ast = p.parse(sourceString, sourceName, lineno);
        from sourceString to sourceString
  Data flow
        Parser.parse line 591
        this.ts = new TokenStream(this, null, sourceString, lineno);
        from sourceString to TokenStream.sourceString
  Data flow
        TokenStream.getChar line  1474
        c = sourceString.charAt(sourceCursor++);
        from sourceString[78] to c
  Data flow
        TokenStream.getChar line 1511