package apptitudeLogics;

public class DayFromDate {

	/* logic 
	 * steps -> take sum
	 * 1) add the day
	 * 2) add month code
	 * 3) add century code
	 * 4) add year
	 * 5) add year/4
	 * 
	 * 6) find sum%7 
	 * compare with day code and return the day
	 * */
	static int[] monCode = {0,3,3,6,1,4,6,2,5,0,3,5};
	static int[] cenCode = {6,4,2,0,6,4,2};
	
	public static void main(String[] args) {
		
		String date = "29-mar-2024";
		int[] dateArr = returnDate(date);
		switch (returnDay(dateArr)) {
		case 0: System.out.println("SUNDAY");break;
		case 1: System.out.println("MONDAY");break;
		case 2: System.out.println("TUESDAY");break;
		case 3: System.out.println("WEDNUSDAY");break;
		case 4: System.out.println("THURSDAY");break;
		case 5: System.out.println("FRIDAY");break;
		case 6: System.out.println("SATURDAY");break;
		}
		
	}
	public static int[] returnDate(String date) {
		String dy = date.substring(0, 2);
		String mon = returnmonth(date.substring(3, 6));
		String yr = date.substring(7, date.length());
		
		int[] dateArr= {Integer.parseInt(dy),Integer.parseInt(mon),Integer.parseInt(yr)};
		return dateArr;
	}
	public static int returnDay(int[]date) {

		int centuryCode = (date[2]/100)-16;
		int sum = date[0] + monCode[date[1]-1]+cenCode[centuryCode]+(date[2]%100)+((date[2]%100)/4);
		if (date[2]%4==0&&date[1]<=2) {
			sum-=1;
		}
		return sum%7;
	}
}
