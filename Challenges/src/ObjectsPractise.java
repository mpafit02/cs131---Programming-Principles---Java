
class People{
	private double height;
	private int weight;
	private char sex;
	public String name;
	private static int counter;
	private static String[] arr = new String[1000];
	private static int i = 0;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public People() {
		counter++;
		height = 1.75;
		weight = 67;
		sex = 'M';
		name = "Giannis";
		arr[i] = name;
		i++;
	}
	
	public People(double h, int w, char s, String n) {
		counter++;
		height = h;
		weight = w;
		sex = s;
		name = n;
		arr[i] = name;
		i++;
	}
	
	public static void showNames() {
		for(int j = 0; j < 10; j++) {
			System.out.println(arr[j]);
		}
	}
	
	public void vaftisi(String name) {
		this.name = name;
	}
}

public class ObjectsPractise {

	public static void main(String[] args) {
		People person1 = new People();
		People person2 = new People(1.69, 102, 'F', "Afroksilanthi");
		System.out.println(person1.getName());
		System.out.println(person2.getName());
		person2.setName("Marios");
		System.out.println(person2.getName());
		System.out.println();
		People.showNames();
	}

}
