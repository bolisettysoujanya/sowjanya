import java.util.Date;
class Comparable
{
    int id,string fullname,Date birthdate,Double avgmarks;

}

/**
 * Class that stores information about the concrete student
 *
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 *
 */
public class Student implements Comparable {

	/**
	 * student id
	 */
	private int id;
	public void details()
	{
	    id="";
	    System.out.println(id+"");
	}

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;
	public void details1()
	{
	    fullname="";
	    System.out.prinln(fullname+"");
	}

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;
	public void details2()
	{
	    birthDate="mm/dd/yyyy";
	    System.out.println(birthDate+"mm/dd/yyyy");
	}

	/**
	 * student average mark
	 */
	private double avgMark;
	public void details3()
	{
	    avgMarks="";
	    System.out.println(avgMarks+"")
	}

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
	public Static void main(string[] args)
	{
	    Student obj=new Student();
	    obj.details();
	    obj.details1();
	    obj.dfetails2();
	    obj.details3();


	}

}
