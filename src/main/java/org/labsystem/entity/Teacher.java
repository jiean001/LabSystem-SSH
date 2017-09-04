package org.labsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher implements java.io.Serializable {

	private static final long serialVersionUID = -8622519986304282553L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
	private Integer teacherId;
	@Column(name = "teachername_c")
	private String teachernameC;
	@Column(name = "teachername_e")
	private String teachernameE;
	@Column(name = "teachergender")
	private Boolean teachergender;
	@Column(name = "teacherbirth")
	private Date teacherbirth;
	@Column(name = "edubkgrd_id")
	private Integer edubkgrdId;
	@Column(name = "profsntitle_id")
	private Integer profsntitleId;
	@Column(name = "supervisortype_id")
	private Integer supervisortypeId;
	@Column(name = "teacherpic")
	private String teacherpic;
	@Column(name = "teacherphone")
	private String teacherphone;
	@Column(name = "teacheremail")
	private String teacheremail;
	@Column(name = "teacherbriefintro_c")
	private String teacherbriefintroC;
	@Column(name = "teacherbriefintro_e")
	private String teacherbriefintroE;

	public Teacher() {
	}

	public Teacher(String teachernameC) {
		this.teachernameC = teachernameC;
	}

	public Teacher(String teachernameC, String teachernameE, Boolean teachergender, Date teacherbirth,
			Integer edubkgrdId, Integer profsntitleId, Integer mentortypeId, String teacherpic, String teacherphone,
			String teacheremail, String teacherbriefintroC, String teacherbriefintroE) {
		this.teachernameC = teachernameC;
		this.teachernameE = teachernameE;
		this.teachergender = teachergender;
		this.teacherbirth = teacherbirth;
		this.edubkgrdId = edubkgrdId;
		this.profsntitleId = profsntitleId;
		this.supervisortypeId = mentortypeId;
		this.teacherpic = teacherpic;
		this.teacherphone = teacherphone;
		this.teacheremail = teacheremail;
		this.teacherbriefintroC = teacherbriefintroC;
		this.teacherbriefintroE = teacherbriefintroE;
	}

	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeachernameC() {
		return this.teachernameC;
	}

	public void setTeachernameC(String teachernameC) {
		this.teachernameC = teachernameC;
	}

	public String getTeachernameE() {
		return this.teachernameE;
	}

	public void setTeachernameE(String teachernameE) {
		this.teachernameE = teachernameE;
	}

	public Boolean getTeachergender() {
		return this.teachergender;
	}

	public void setTeachergender(Boolean teachergender) {
		this.teachergender = teachergender;
	}

	public Date getTeacherbirth() {
		return this.teacherbirth;
	}

	public void setTeacherbirth(Date teacherbirth) {
		this.teacherbirth = teacherbirth;
	}

	public Integer getEdubkgrdId() {
		return this.edubkgrdId;
	}

	public void setEdubkgrdId(Integer edubkgrdId) {
		this.edubkgrdId = edubkgrdId;
	}

	public Integer getProfsntitleId() {
		return this.profsntitleId;
	}

	public void setProfsntitleId(Integer profsntitleId) {
		this.profsntitleId = profsntitleId;
	}

	public Integer getSupervisortypeId() {
		return this.supervisortypeId;
	}

	public void setsupervisortypeId(Integer mentortypeId) {
		this.supervisortypeId = mentortypeId;
	}

	public String getTeacherpic() {
		return this.teacherpic;
	}

	public void setTeacherpic(String teacherpic) {
		this.teacherpic = teacherpic;
	}

	public String getTeacherphone() {
		return this.teacherphone;
	}

	public void setTeacherphone(String teacherphone) {
		this.teacherphone = teacherphone;
	}

	public String getTeacheremail() {
		return this.teacheremail;
	}

	public void setTeacheremail(String teacheremail) {
		this.teacheremail = teacheremail;
	}

	public String getTeacherbriefintroC() {
		return this.teacherbriefintroC;
	}

	public void setTeacherbriefintroC(String teacherbriefintroC) {
		this.teacherbriefintroC = teacherbriefintroC;
	}

	public String getTeacherbriefintroE() {
		return this.teacherbriefintroE;
	}

	public void setTeacherbriefintroE(String teacherbriefintroE) {
		this.teacherbriefintroE = teacherbriefintroE;
	}

}
