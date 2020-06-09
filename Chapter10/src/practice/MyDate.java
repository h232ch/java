package practice;


public class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			return (this.day==md.day&&this.year==md.year&&this.month==md.month);
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.year+this.month+this.day;
	}
	
	
	
	
	
	

}
