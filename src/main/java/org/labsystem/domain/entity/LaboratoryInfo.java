package org.labsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laboratoryinfo")
public class LaboratoryInfo implements java.io.Serializable {

	private static final long serialVersionUID = -7026499635914334171L;
	@Id
	@Column(name = "laboratory_id")
	private int laboratoryId;
	@Column(name = "laboratoryname_c")
	private String laboratorynameC;
	@Column(name = "laboratoryname_e")
	private String laboratorynameE;
	@Column(name = "laboratorytitle_c")
	private String laboratorytitleC;
	@Column(name = "laboratorytitle_e")
	private String laboratorytitleE;
	@Column(name = "laboratoryintro_c")
	private String laboratoryintroC;
	@Column(name = "laboratoryintro_e")
	private String laboratoryintroE;
	@Column(name = "laboratoryphone")
	private String laboratoryphone;
	@Column(name = "laboratoryemail")
	private String laboratoryemail;
	@Column(name = "laboratoryadd_c")
	private String laboratoryaddC;
	@Column(name = "laboratoryadd_e")
	private String laboratoryaddE;
	@Column(name = "laboratoryqq")
	private String laboratoryqq;
	@Column(name = "laboratoryweibo")
	private String laboratoryweibo;

	public LaboratoryInfo() {
	}

	public LaboratoryInfo(int laboratoryId, String laboratorynameC) {
		this.laboratoryId = laboratoryId;
		this.laboratorynameC = laboratorynameC;
	}

	public LaboratoryInfo(int laboratoryId, String laboratorynameC, String laboratorynameE, String laboratorytitleC,
			String laboratorytitleE, String laboratoryintroC, String laboratoryintroE, String laboratoryphone,
			String laboratoryemail, String laboratoryaddC, String laboratoryaddE, String laboratoryqq,
			String laboratoryweibo) {
		this.laboratoryId = laboratoryId;
		this.laboratorynameC = laboratorynameC;
		this.laboratorynameE = laboratorynameE;
		this.laboratorytitleC = laboratorytitleC;
		this.laboratorytitleE = laboratorytitleE;
		this.laboratoryintroC = laboratoryintroC;
		this.laboratoryintroE = laboratoryintroE;
		this.laboratoryphone = laboratoryphone;
		this.laboratoryemail = laboratoryemail;
		this.laboratoryaddC = laboratoryaddC;
		this.laboratoryaddE = laboratoryaddE;
		this.laboratoryqq = laboratoryqq;
		this.laboratoryweibo = laboratoryweibo;
	}

	public int getLaboratoryId() {
		return this.laboratoryId;
	}

	public void setLaboratoryId(int laboratoryId) {
		this.laboratoryId = laboratoryId;
	}

	public String getLaboratorynameC() {
		return this.laboratorynameC;
	}

	public void setLaboratorynameC(String laboratorynameC) {
		this.laboratorynameC = laboratorynameC;
	}

	public String getLaboratorynameE() {
		return this.laboratorynameE;
	}

	public void setLaboratorynameE(String laboratorynameE) {
		this.laboratorynameE = laboratorynameE;
	}

	public String getLaboratorytitleC() {
		return this.laboratorytitleC;
	}

	public void setLaboratorytitleC(String laboratorytitleC) {
		this.laboratorytitleC = laboratorytitleC;
	}

	public String getLaboratorytitleE() {
		return this.laboratorytitleE;
	}

	public void setLaboratorytitleE(String laboratorytitleE) {
		this.laboratorytitleE = laboratorytitleE;
	}

	public String getLaboratoryintroC() {
		return this.laboratoryintroC;
	}

	public void setLaboratoryintroC(String laboratoryintroC) {
		this.laboratoryintroC = laboratoryintroC;
	}

	public String getLaboratoryintroE() {
		return this.laboratoryintroE;
	}

	public void setLaboratoryintroE(String laboratoryintroE) {
		this.laboratoryintroE = laboratoryintroE;
	}

	public String getLaboratoryphone() {
		return this.laboratoryphone;
	}

	public void setLaboratoryphone(String laboratoryphone) {
		this.laboratoryphone = laboratoryphone;
	}

	public String getLaboratoryemail() {
		return this.laboratoryemail;
	}

	public void setLaboratoryemail(String laboratoryemail) {
		this.laboratoryemail = laboratoryemail;
	}

	public String getLaboratoryaddC() {
		return this.laboratoryaddC;
	}

	public void setLaboratoryaddC(String laboratoryaddC) {
		this.laboratoryaddC = laboratoryaddC;
	}

	public String getLaboratoryaddE() {
		return this.laboratoryaddE;
	}

	public void setLaboratoryaddE(String laboratoryaddE) {
		this.laboratoryaddE = laboratoryaddE;
	}

	public String getLaboratoryqq() {
		return this.laboratoryqq;
	}

	public void setLaboratoryqq(String laboratoryqq) {
		this.laboratoryqq = laboratoryqq;
	}

	public String getLaboratoryweibo() {
		return this.laboratoryweibo;
	}

	public void setLaboratoryweibo(String laboratoryweibo) {
		this.laboratoryweibo = laboratoryweibo;
	}

}
