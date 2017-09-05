package org.labsystem.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements java.io.Serializable {

	private static final long serialVersionUID = -5687900493883975548L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer studentId;
	@Column(name = "student_num")
	private String studentNum;
	@Column(name = "studentname_c")
	private String studentnameC;
	@Column(name = "studentname_e")
	private String studentnameE;
	@Column(name = "stubir")
	private Date stubir;
	@Column(name = "stupic")
	private String stupic;
	@Column(name = "stuphone")
	private String stuphone;
	@Column(name = "stuemail")
	private String stuemail;
	@Column(name = "stubriefintro_c")
	private String stubriefintroC;
	@Column(name = "stubriefintro_e")
	private String stubriefintroE;
	@Column(name = "edubkgrd_id")
	private Integer edubkgrdId;

	public Student() {
	}

	public Student(String studentNum, String studentnameC, String studentnameE, Date stubir, String stupic,
			String stuphone, String stuemail, String stubriefintroC, String stubriefintroE, Integer edubkgrdId) {
		this.studentNum = studentNum;
		this.studentnameC = studentnameC;
		this.studentnameE = studentnameE;
		this.stubir = stubir;
		this.stupic = stupic;
		this.stuphone = stuphone;
		this.stuemail = stuemail;
		this.stubriefintroC = stubriefintroC;
		this.stubriefintroE = stubriefintroE;
		this.edubkgrdId = edubkgrdId;
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentNum() {
		return this.studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentnameC() {
		return this.studentnameC;
	}

	public void setStudentnameC(String studentnameC) {
		this.studentnameC = studentnameC;
	}

	public String getStudentnameE() {
		return this.studentnameE;
	}

	public void setStudentnameE(String studentnameE) {
		this.studentnameE = studentnameE;
	}

	public Date getStubir() {
		return this.stubir;
	}

	public void setStubir(Date stubir) {
		this.stubir = stubir;
	}

	public String getStupic() {
		return this.stupic;
	}

	public void setStupic(String stupic) {
		this.stupic = stupic;
	}

	public String getStuphone() {
		return this.stuphone;
	}

	public void setStuphone(String stuphone) {
		this.stuphone = stuphone;
	}

	public String getStuemail() {
		return this.stuemail;
	}

	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}

	public String getStubriefintroC() {
		return this.stubriefintroC;
	}

	public void setStubriefintroC(String stubriefintroC) {
		this.stubriefintroC = stubriefintroC;
	}

	public String getStubriefintroE() {
		return this.stubriefintroE;
	}

	public void setStubriefintroE(String stubriefintroE) {
		this.stubriefintroE = stubriefintroE;
	}

	public Integer getEdubkgrdId() {
		return this.edubkgrdId;
	}

	public void setEdubkgrdId(Integer edubkgrdId) {
		this.edubkgrdId = edubkgrdId;
	}

}
