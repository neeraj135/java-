public class text7{
	public static void main(String args[]){
   		Day birthday = new day(1951,5,26);
      	Day lastday = new day(2012,5,26);
   	    int daysAlive = lastday.daysFrom(birthday);
		System.out.println(daysAlive);  	
	}
}
