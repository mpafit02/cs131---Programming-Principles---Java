
public class GradesMaths {

	public static void main(String[] args) {
		String id[] = new String[112];
		double grade[] = new double[112];
		double temp;
		String temp2;
		for(int i = 0; i < 112; i++) {
			id[i] = StdIn.readString();
			grade[i] = StdIn.readDouble();
		}
		for(int i = 0; i < 112; i++) {
			for(int j = 1; j < 111; j++) {
				  if(grade[j-1] > grade[j]){  
                      //swap elements  
                      temp = grade[j-1];  
                      grade[j-1] = grade[j];  
                      grade[j] = temp;  
                      temp2 = id[j-1];  
                      id[j-1] = id[j];  
                      id[j] = temp2; 
              } 
			}
		}
		for(int i = 0; i < 112; i++) {
			System.out.printf("%s\t%.1f\n",id[i],grade[i]);
		}
	}

}
