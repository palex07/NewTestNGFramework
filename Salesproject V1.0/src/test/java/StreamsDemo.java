import java.util.ArrayList;

public class StreamsDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ashak Loyd");
		names.add("Ashan");
		names.add("Sam");
		names.add("Prasanth");
		names.add("Ashok");
				
		System.out.println("The Array names are"  +names);
		//count the names starts with A
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("The names starts with A are" + c);
		//Find the names length >4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println("The names> 4 Char are " +s));
		//find the names length>4 and limit to 2 names
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println("The 2 names are" +s));
		
		Long a=names.stream().filter(s->s.endsWith("h")).count();
		
		System.out.println("Name Ends with h is" + a);
	}

}
