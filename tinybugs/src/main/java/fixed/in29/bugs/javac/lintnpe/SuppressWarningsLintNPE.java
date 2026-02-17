package fixed.in29.bugs.javac.lintnpe;

// fixed via https://github.com/apache/netbeans/pull/9044

// https://github.com/apache/netbeans/issues/8722
// https://bugs.openjdk.org/browse/JDK-8365314
public class SuppressWarningsLintNPE {
    
    @SuppressWarnings("")
    private void ok()  {
        
    }

//    @SuppressWarnings
    private void npe()  {
        // failure during parsing and completion
    }
    
/*
    Caused: java.lang.NullPointerException: Cannot read field "values" because "values" is null
	at com.sun.tools.javac.code.Lint.suppressionsFrom(Lint.java:532)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:214)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.Iterator.forEachRemaining(Iterator.java:133)
	at java.base/java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1939)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
	at com.sun.tools.javac.code.Lint.suppressionsFrom(Lint.java:524)
	at com.sun.tools.javac.code.Lint.suppressionsFrom(Lint.java:511)
	at com.sun.tools.javac.code.Lint.augment(Lint.java:82)
	at com.sun.tools.javac.comp.Check.lambda$checkPotentiallyAmbiguousOverloads$9(Check.java:2740)
	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1763)
	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1751)
	at com.sun.tools.javac.comp.Check.lambda$checkPotentiallyAmbiguousOverloads$10(Check.java:2739)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at com.sun.tools.javac.comp.Check.checkPotentiallyAmbiguousOverloads(Check.java:2739)
	at com.sun.tools.javac.comp.Attr.attribClassBody(Attr.java:5637)
	at com.sun.tools.javac.comp.Attr.attribClass(Attr.java:5550)
	at com.sun.tools.javac.comp.Attr.attribClass(Attr.java:5365)
	at org.netbeans.lib.nbjavac.services.NBAttr.attribClass(NBAttr.java:74)
	at com.sun.tools.javac.comp.Attr.attrib(Attr.java:5302)
	at com.sun.tools.javac.main.JavaCompiler.attribute(JavaCompiler.java:1346)
	at com.sun.tools.javac.main.JavaCompiler.attribute(JavaCompiler.java:1319)
	at com.sun.tools.javac.api.JavacTaskImpl.analyze(JavacTaskImpl.java:404)
	at com.sun.tools.javac.api.JavacTaskImpl.lambda$analyze$1(JavacTaskImpl.java:379)
	at com.sun.tools.javac.api.JavacTaskImpl.invocationHelper(JavacTaskImpl.java:152)
	at com.sun.tools.javac.api.JavacTaskImpl.analyze(JavacTaskImpl.java:379)
Caused: java.lang.IllegalStateException
	at com.sun.tools.javac.api.JavacTaskImpl.analyze(JavacTaskImpl.java:383)
[catch] at org.netbeans.modules.java.source.parsing.JavacParser.moveToPhase(JavacParser.java:765)
	at org.netbeans.modules.java.source.parsing.CompilationInfoImpl.toPhase(CompilationInfoImpl.java:425)
	at org.netbeans.api.java.source.CompilationController.toPhase(CompilationController.java:90)
	at org.netbeans.modules.java.completion.JavaCompletionTask.getSmartTypes(JavaCompletionTask.java:5724)
	at org.netbeans.modules.java.completion.JavaCompletionTask.insideAnnotation(JavaCompletionTask.java:1276)
	at org.netbeans.modules.java.completion.JavaCompletionTask.resolve(JavaCompletionTask.java:357)
	at org.netbeans.modules.java.completion.BaseTask.run(BaseTask.java:96)
	at org.netbeans.modules.java.completion.JavaCompletionTask.run(JavaCompletionTask.java:67)
	at org.netbeans.modules.parsing.impl.TaskProcessor.callUserTask(TaskProcessor.java:586)
	at org.netbeans.modules.parsing.api.ParserManager$UserTaskAction.run(ParserManager.java:197)
	at org.netbeans.modules.parsing.api.ParserManager$UserTaskAction.run(ParserManager.java:180)
	at org.netbeans.modules.parsing.impl.TaskProcessor$2.call(TaskProcessor.java:181)
	at org.netbeans.modules.parsing.impl.TaskProcessor$2.call(TaskProcessor.java:178)
	at org.netbeans.modules.masterfs.filebasedfs.utils.FileChangedManager.priorityIO(FileChangedManager.java:153)
	at org.netbeans.modules.masterfs.providers.ProvidedExtensions.priorityIO(ProvidedExtensions.java:335)
	at org.netbeans.modules.parsing.nb.DataObjectEnvFactory.runPriorityIO(DataObjectEnvFactory.java:118)
	at org.netbeans.modules.parsing.impl.Utilities.runPriorityIO(Utilities.java:67)
	at org.netbeans.modules.parsing.impl.TaskProcessor.runUserTask(TaskProcessor.java:178)
Caused: org.netbeans.modules.parsing.spi.ParseException
	at org.netbeans.modules.parsing.impl.TaskProcessor.runUserTask(TaskProcessor.java:186)
	at org.netbeans.modules.parsing.api.ParserManager.parse(ParserManager.java:83)
[catch] at org.netbeans.modules.editor.java.JavaCompletionProvider$JavaCompletionQuery.query(JavaCompletionProvider.java:193)
	at org.netbeans.spi.editor.completion.support.AsyncCompletionTask.run(AsyncCompletionTask.java:198)
	at org.openide.util.RequestProcessor$Task.run(RequestProcessor.java:1403)
	at org.netbeans.modules.openide.util.GlobalLookup.execute(GlobalLookup.java:45)
	at org.openide.util.lookup.Lookups.executeWith(Lookups.java:287)
	at org.openide.util.RequestProcessor$Processor.run(RequestProcessor.java:2018)
*/

}
