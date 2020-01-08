package main;

import java.util.*;
import javax.persistence.*;

@Entity(name = "Essay")
@Table(name = "essays")
public class Essay {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;

	@Column(name = "es_title")
	String title;

	@Temporal(TemporalType.DATE)
	@Column(name = "pub_date")
	Date pubDate;

	@Column(name = "requirements")
	String requirements;

	@Column(name = "es_desc")
	String desc;

	@Column(name = "keywords")
	String keywords;

	@Column(name = "es_type")
	boolean type;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	@JoinTable(name = "essays_student", joinColumns = @JoinColumn(name = "essays_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
	private Set<Student> students = new HashSet<>();
	
	public Essay() {
		super();
	}
	
	public Essay(String title, Date pubDate, String requirements, String desc, String keywords, boolean type) {
		super();
		this.title = title;
		this.pubDate = pubDate;
		this.requirements = requirements;
		this.desc = desc;
		this.keywords = keywords;
		this.type = type;
	}

	
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> student_requests) {
		this.students = student_requests;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
}
