public class Course implements CourseTransaction
{
	private 
	int courseNumber , credit;
	
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber= courseNumber;
	}
	
    public void setCredit(int credit)
	{
		this.credit=credit;
	}
    public int getCourseNumber( )
	{
		return courseNumber;
	}
	
    public int getCredit( )
	{
		return credit;
	}
    public void showInfo( )
	{
		System.out.println(" TOTAL NUMBER OF COURSES : " + getCourseNumber() )
	    System.out.println(" TOTAL NUMBER OF CREDITS : " + getCredit() )
	}
}