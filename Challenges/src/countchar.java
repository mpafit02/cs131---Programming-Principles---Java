public class countchar {

	public static void main(String[] args) {
		char array[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						'o','p','q','r','s','t','u','v','w','x','y','z'};
		int arr[] = new int [array.length];
		int index = 0;
		
		String s = "abcdefg asdsad";
		
		for(int i = 0; i<s.length(); i++) {
			while(index != 24) {
				if(s.charAt(i) == array[index]) {
					arr[index]++;
				}
				index++;
			}
			index = 0;
		}
		for(int i = 0; i<array.length; i++) {
			System.out.println("number of "+array[i] + ": " + arr[i]);
		}
	}
}

