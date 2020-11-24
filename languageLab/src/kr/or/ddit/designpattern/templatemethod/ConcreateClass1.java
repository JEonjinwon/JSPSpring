package kr.or.ddit.designpattern.templatemethod;

public class ConcreateClass1  extends TemplateClass{

	@Override
	public void hookmethod() {
		System.out.println("구체적인 작업 내용 :" +getClass().getSimpleName());
	}
}
