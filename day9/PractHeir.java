package day9;

class teacher {
	public void teach() {
		System.out.println("teacher is teaching");
	}
	public void attendance() {
		System.out.println("teacher taking attendance");
	}
}

class mathsteacher extends teacher {
	public void teach() {
		
		super.teach();
		System.out.println("maths teacher is teaching maths");
	}
}
class scienceteacher extends teacher {
	public void teach() {
		super.teach();
		System.out.println("Science teacher is teaching science");
	}
}



public class PractHeir {
	public static void main(String[] args) {
		PractHeir kr=new PractHeir();
		mathsteacher a=new mathsteacher();
		scienceteacher b=new scienceteacher();
		a.teach();
		b.attendance();
		b.teach();
		
	}

}
