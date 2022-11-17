package array;

public class Train {String getName(){
	return "Generic Training";
	}
	void getNumberOfParticipants(){
	System.out.println( "Each group has n participants in " + getName() );
	}
	public static void main(String[]args) {
	Train f=new Train();
	System.out.println(f.getName());
	f.getNumberOfParticipants();
	FullStackTraining h = new FullStackTraining();
	System.out.println(h.getName());
	h.getNumberOfParticipants();
	}



	}
	class FullStackTraining extends Train{
	void getNumberOfParticipants() {
	System.out.println("Each group has 36 participants in "+ getName());
	}
	String getName(){
	return "Java Class";
	}

}
