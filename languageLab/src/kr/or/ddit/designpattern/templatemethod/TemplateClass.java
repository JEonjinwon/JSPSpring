package kr.or.ddit.designpattern.templatemethod;

public abstract class TemplateClass {
	public final void template() {
		start();
		hookmethod();
		end();
	}
	private void start() {
		System.out.println("START");
	}
	protected abstract void hookmethod();
	
	private void end() {
		System.out.println("End");
	}
}
