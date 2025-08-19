package bugs.gotomethodreference;

import javax.swing.event.ChangeListener;

// https://github.com/apache/netbeans/issues/8735
public class GoToInvalidMethodReferenceNPE {

    public static void main(String args[]) {
//        ChangeListener listener = GoToInvalidMethodReferenceNPE::invalid;
        //                                                       ^^^^^^^ ctrl click
    }
}
/*
java.lang.NullPointerException: Cannot invoke "com.sun.tools.javac.code.Scope$WriteableScope.getSymbols(com.sun.tools.javac.code.Scope$LookupKind)" because the return value of "com.sun.tools.javac.code.Symbol$TypeSymbol.members()" is null
	at com.sun.tools.javac.code.Symbol$TypeSymbol.getEnclosedElements(Symbol.java:879)
	at com.sun.tools.javac.code.Symbol$TypeSymbol.getEnclosedElements(Symbol.java:818)
	at org.netbeans.modules.editor.java.GoToSupport.resolveContext(GoToSupport.java:481)
	at org.netbeans.modules.editor.java.GoToSupport$1.run(GoToSupport.java:156)
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
	at org.netbeans.modules.editor.java.GoToSupport.getGoToElementTooltip(GoToSupport.java:147)
Caused: java.lang.IllegalStateException
	at org.netbeans.modules.editor.java.GoToSupport.getGoToElementTooltip(GoToSupport.java:166)
	at org.netbeans.modules.java.editor.hyperlink.JavaHyperlinkProvider.getTooltipText(JavaHyperlinkProvider.java:84)
	at org.netbeans.modules.java.openjdk.editor.JavaToCHyperlinkProvider.getTooltipText(JavaToCHyperlinkProvider.java:182)
	at org.netbeans.lib.editor.hyperlink.HyperlinkOperation$TooltipResolver.getValue(HyperlinkOperation.java:487)
	at org.netbeans.lib.editor.hyperlink.HyperlinkOperation$TooltipResolver.getValue(HyperlinkOperation.java:472)
	at org.netbeans.modules.editor.NbToolTip$Request.getTooltipFromHighlightingLayers(NbToolTip.java:427)
	at org.netbeans.modules.editor.NbToolTip$Request.resolveTooltipText(NbToolTip.java:415)
	at org.netbeans.modules.editor.NbToolTip$Request.run(NbToolTip.java:344)
	at org.openide.util.RequestProcessor$Task.run(RequestProcessor.java:1403)
	at org.netbeans.modules.openide.util.GlobalLookup.execute(GlobalLookup.java:45)
	at org.openide.util.lookup.Lookups.executeWith(Lookups.java:287)
*/