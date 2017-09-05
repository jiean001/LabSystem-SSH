package org.labsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stuyear")
public class Stuyear implements java.io.Serializable {

	private static final long serialVersionUID = 3432005531769668807L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stuyear_id")
	private Integer stuyearId;
	@Column(name = "year")
	private String year;
	@Column(name = "stu_id")
	private Integer stuId;
	@Column(name = "stuyearintro_c")
	private String stuyearintroC;
	@Column(name = "stuyearintro_e")
	private String stuyearintroE;

	public Stuyear() {
	}

	public Stuyear(String year, Integer stuId, String stuyearintroC, String stuyearintroE) {
		this.year = year;
		this.stuId = stuId;
		this.stuyearintroC = stuyearintroC;
		this.stuyearintroE = stuyearintroE;
	}

	public Integer getStuyearId() {
		return this.stuyearId;
	}

	public void setStuyearId(Integer stuyearId) {
		this.stuyearId = stuyearId;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuyearintroC() {
		return this.stuyearintroC;
	}

	public void setStuyearintroC(String stuyearintroC) {
		this.stuyearintroC = stuyearintroC;
	}

	public String getStuyearintroE() {
		return this.stuyearintroE;
	}

	public void setStuyearintroE(String stuyearintroE) {
		this.stuyearintroE = stuyearintroE;
	}

}
