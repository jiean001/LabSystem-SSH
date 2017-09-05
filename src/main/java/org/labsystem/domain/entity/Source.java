package org.labsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "source")
public class Source implements java.io.Serializable {

	private static final long serialVersionUID = -2797464089860772569L;
	@Id
	@Column(name = "source_id")
	private Integer sourceId;
	@Column(name = "sourcename_c")
	private String sourcenameC;
	@Column(name = "sourcename_e")
	private String sourcenameE;
	@Column(name = "sourceintro_c")
	private String sourceintroC;
	@Column(name = "sourceintro_e")
	private String sourceintroE;
	@Column(name = "sourcelevel")
	private Integer sourcelevel;
	@Column(name = "sourcescore")
	private Integer sourcescore;

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("sourceId:").append(this.sourceId);
		str.append(", sourcenameC:").append(this.sourcenameC);
		str.append(", sourcenameE:").append(this.sourcenameE);
		str.append(", sourceintroC:").append(this.sourceintroC);
		str.append(", sourceintroE:").append(this.sourceintroE);
		str.append(", sourcelevel:").append(this.sourcelevel);
		str.append(", sourcescore:").append(this.sourcescore);
		return str.toString();
	}

	public Source() {
	}

	public Integer getSourceId() {
		return this.sourceId;
	}

	/*
	 * public void setSourceId(Integer sourceId) { this.sourceId = sourceId; }
	 */

	public String getSourcenameC() {
		return this.sourcenameC;
	}

	/*
	 * public void setSourcenameC(String sourcenameC) { this.sourcenameC =
	 * sourcenameC; }
	 */

	public String getSourcenameE() {
		return this.sourcenameE;
	}

	/*
	 * public void setSourcenameE(String sourcenameE) { this.sourcenameE =
	 * sourcenameE; }
	 */

	public String getSourceintroC() {
		return this.sourceintroC;
	}

	/*
	 * public void setSourceintroC(String sourceintroC) { this.sourceintroC =
	 * sourceintroC; }
	 */

	public String getSourceintroE() {
		return this.sourceintroE;
	}

	/*
	 * public void setSourceintroE(String sourceintroE) { this.sourceintroE =
	 * sourceintroE; }
	 */

	public Integer getSourcelevel() {
		return this.sourcelevel;
	}

	/*
	 * public void setSourcelevel(Integer sourcelevel) { this.sourcelevel =
	 * sourcelevel; }
	 */

	public Integer getSourcescore() {
		return this.sourcescore;
	}

	/*
	 * public void setSourcescore(Integer sourcescore) { this.sourcescore =
	 * sourcescore; }
	 */

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Source))
			return false;
		Source castOther = (Source) other;

		return ((this.getSourceId() == castOther.getSourceId()) || (this.getSourceId() != null
				&& castOther.getSourceId() != null && this.getSourceId().equals(castOther.getSourceId())))
				&& ((this.getSourcenameC() == castOther.getSourcenameC())
						|| (this.getSourcenameC() != null && castOther.getSourcenameC() != null
								&& this.getSourcenameC().equals(castOther.getSourcenameC())))
				&& ((this.getSourcenameE() == castOther.getSourcenameE())
						|| (this.getSourcenameE() != null && castOther.getSourcenameE() != null
								&& this.getSourcenameE().equals(castOther.getSourcenameE())))
				&& ((this.getSourceintroC() == castOther.getSourceintroC())
						|| (this.getSourceintroC() != null && castOther.getSourceintroC() != null
								&& this.getSourceintroC().equals(castOther.getSourceintroC())))
				&& ((this.getSourceintroE() == castOther.getSourceintroE())
						|| (this.getSourceintroE() != null && castOther.getSourceintroE() != null
								&& this.getSourceintroE().equals(castOther.getSourceintroE())))
				&& ((this.getSourcelevel() == castOther.getSourcelevel())
						|| (this.getSourcelevel() != null && castOther.getSourcelevel() != null
								&& this.getSourcelevel().equals(castOther.getSourcelevel())))
				&& ((this.getSourcescore() == castOther.getSourcescore())
						|| (this.getSourcescore() != null && castOther.getSourcescore() != null
								&& this.getSourcescore().equals(castOther.getSourcescore())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSourceId() == null ? 0 : this.getSourceId().hashCode());
		result = 37 * result + (getSourcenameC() == null ? 0 : this.getSourcenameC().hashCode());
		result = 37 * result + (getSourcenameE() == null ? 0 : this.getSourcenameE().hashCode());
		result = 37 * result + (getSourceintroC() == null ? 0 : this.getSourceintroC().hashCode());
		result = 37 * result + (getSourceintroE() == null ? 0 : this.getSourceintroE().hashCode());
		result = 37 * result + (getSourcelevel() == null ? 0 : this.getSourcelevel().hashCode());
		result = 37 * result + (getSourcescore() == null ? 0 : this.getSourcescore().hashCode());
		return result;
	}

}
