package kr.or.ddit.designpattern.templatemethod;

public class TestMain {
	public static void main(String[] args) {
		TemplateClass[] jobs = new TemplateClass[4];
		for (int i = 0; i < jobs.length; i++) {
			if(i<2) {
				jobs[i]=new ConcreateClass1(); 
			}else {
				jobs[i]=new ConcreateClass2(); 
			}
		}
		for (TemplateClass job : jobs) {
			job.template();
		}
	
	
	}
}
