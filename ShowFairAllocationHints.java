import gradingTools.comp533s24.assignment01.S24Assignment0_1Suite;
import gradingTools.comp533s24.assignment01.S24Assignment0_1SuiteNoHints;
import gradingTools.shared.testcases.concurrency.oddNumbers.hints.AbstractHint;
import gradingTools.shared.testcases.concurrency.oddNumbers.hints.FairAllocationHintsSuite;
import gradingTools.shared.testcases.concurrency.oddNumbers.hints.ForkJoinHintsSuite;
import trace.grader.basics.GraderBasicsTraceUtility;

public class ShowFairAllocationHints {
	public static void main(String[] args) {
		OddNumbersUtil.setDoTests(true);
		OddNumbersUtil.setTraceFairAllocation(true);

//		// if you want to step through local checks calls to your code
//		// set this to false
//		BasicProjectExecution.setUseMethodAndConstructorTimeOut(false);
		
		// if you set this to false, grader steps will not be traced
		
		
//		// if you set this to false, all grader steps will be traced,
//		// not just the ones that failed
		GraderBasicsTraceUtility.setBufferTracedMessages(false);
		GraderBasicsTraceUtility.setTracerShowInfo(false);
//		// Change this number if a test trace gets longer than 600 and is clipped
//		GraderBasicsTraceUtility.setMaxPrintedTraces(600);
//		
//		// Change this number if all traces together are longer than 2000
//		GraderBasicsTraceUtility.setMaxTraces(2000);
		
//		// Change this number if your process times out prematurely
//		BasicProjectExecution.setProcessTimeOut(5);
//		
		GraderBasicsTraceUtility.setPrintPreTestAnnouncement(false);
		// Change this to false if you want a hint to printed regardless of whether the
		// hint is needed to correct the associated test
		AbstractHint.setCheckIfPrecedingTestIsCorrect(true);
		AbstractHint.setCheckIfPrecedingHintHasBeenExecuted(false);
		
		// You need to always call such a method
		FairAllocationHintsSuite.main(args);
//		F23Assignment0_1Suite.main(args);
//		
//		ForkJoinHintsSuite.main(args);
	}
}
