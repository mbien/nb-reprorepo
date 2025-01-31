//java.lang.NullPointerException: Cannot read field "outer" because "env" is null
//	at com.sun.tools.javac.api.JavacScope.create(JavacScope.java:60)
//	at com.sun.tools.javac.api.JavacTrees.getScope(JavacTrees.java:725)
//	at com.sun.tools.javac.api.JavacTrees.getScope(JavacTrees.java:157)
//	at org.netbeans.modules.java.source.parsing.VanillaPartialReparser.reparseMethod(VanillaPartialReparser.java:196)
//	at org.netbeans.modules.java.source.parsing.JavacParser.parseImpl(JavacParser.java:434)
//	at org.netbeans.modules.java.source.parsing.JavacParser.parse(JavacParser.java:366)
//	at org.netbeans.modules.parsing.impl.TaskProcessor.callParse(TaskProcessor.java:598)
//	at org.netbeans.modules.parsing.impl.SourceCache.getResult(SourceCache.java:230)
//	at org.netbeans.modules.parsing.impl.TaskProcessor$RequestPerformer.run(TaskProcessor.java:775)
//	at org.openide.util.lookup.Lookups.executeWith(Lookups.java:288)
//	at org.netbeans.modules.parsing.impl.TaskProcessor$RequestPerformer.execute(TaskProcessor.java:702)
//	at org.netbeans.modules.parsing.impl.TaskProcessor$CompilationJob.run(TaskProcessor.java:663)
//	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
//	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
//	at org.openide.util.RequestProcessor$Task.run(RequestProcessor.java:1420)
//	at org.netbeans.modules.openide.util.GlobalLookup.execute(GlobalLookup.java:45)
//	at org.openide.util.lookup.Lookups.executeWith(Lookups.java:287)
//	at org.openide.util.RequestProcessor$Processor.run(RequestProcessor.java:2035)

// fixed in NB 23
void main() {
    println("Hello World!");
    println(Runtime.version());
    // write anything here
}
