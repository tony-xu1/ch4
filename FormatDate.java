public class FormatDate{
	
	public static void main(String[] args){
	printAmerican("Tuesday", 22, "September", 2026);
	printEuropean("Tuesday", 22, "September", 2026);
	
	
	}

	public static void printAmerican(String dayofweek, int day, String month, int year){
		System.out.println("American Format : " + dayofweek + ", " + month + " " + day + ", " + year);
	}
	
	public static void printEuropean(String dayofweek, int day, String month, int year){
		System.out.println("European format: " + dayofweek + " "  + day + " " + month + " " + year);
		
	}
}
