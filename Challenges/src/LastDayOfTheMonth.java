
public class LastDayOfTheMonth {

	public static void main(String[] args) {
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String day[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String cDay = StdIn.readString();
		int month = StdIn.readInt();
		int cday = StdIn.readInt();
		int cd = 1;
		for(int i =0; i < day.length; i++) {
			if(day[i].equals(cDay)) {
				cd = i;
			}
		}
		for(int i = cday; i <= days[month - 1]; i++) {
			cd++;
			if(cd>7) {
				cd = 1;
			}
		}
		cd--;
		System.out.println(day[cd]);
	}

}
