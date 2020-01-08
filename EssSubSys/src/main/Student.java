package main;

import java.util.*;
import javax.persistence.*;

@Entity(name = "Student")
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "first_name")
	protected String fName;
	
	@Column(name = "last_name")
	protected String lName;
	
	@Column(name = "user_name")
	protected String uName;
	
	@Column(name = "password")
	protected String password;
	
	@Column(name = "email")
	protected String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "act_date")
	protected Date actDate;
	
	@Column(name = "dept")
	protected String dept;
	
	@Column(name = "st_desc")
	String desc;
	@Column(name = "semester")
	int semester;
	@Column(name = "passed")
	int passed;
	@Column(name = "s_type")
	boolean type;

	@ManyToMany(mappedBy="students")
	//@JoinTable(name = "essays_student", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "essays_id"))
	private Set<Essay> essays = new HashSet<>();

	public Student() {
		super();
	}

	public Student(String fName, String lName, String uName, String password, String email, Date actDate, String dept,
			String desc, int semester, int passed, boolean type) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.password = password;
		this.email = email;
		this.actDate = actDate;
		this.dept = dept;
		this.desc = desc;
		this.semester = semester;
		this.passed = passed;
		this.type = type;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getActDate() {
		return actDate;
	}
	public void setActDate(Date actDate) {
		this.actDate = actDate;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getPassed() {
		return passed;
	}

	public void setPassed(int passed) {
		this.passed = passed;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

}
