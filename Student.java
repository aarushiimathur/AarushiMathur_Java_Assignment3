class Student{
	private String name;
	private int prn;
	private String batch;
	private float cgpa;
	
	public Student(String name, int prn, String batch, float cgpa){ //constructor which will take in two methods and assign the values in the setter method
		setName(name);
		setPRN(prn); // assigns values of prn and name in the setter method
		setBatch(batch);
		setCGPA(cgpa);
	}
	
	// have to use camel case or it wont be recognised 
	public String getName(){ //getter method
		return name;
	}
	public void setName(String name){ //setter method
		this.name = name; //this identifies the current instance of 'name'
	}
	
	public int getPRN(){
		return prn;
	}
	public void setPRN(int prn){
		this.prn = prn;
	}
	
	public String getBatch(){ 
		return batch;
	}
	public void setBatch(String batch){ 
		this.batch = batch; 
	}
	
	public float getCGPA(){
		return cgpa;
	}
	public void setCGPA(float cgpa){
		this.cgpa = cgpa;
	}
	
	public void display(){
		System.out.println("Name:" +getName() +"PRN:" +getPRN() +"Batch:" +getBatch() +"CGPA" +getCGPA());
	}
}