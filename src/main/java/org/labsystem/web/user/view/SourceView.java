package org.labsystem.web.user.view;

import org.labsystem.domain.entity.Source;

public class SourceView {
	private Integer sourceId;
	private String sourceName;
	private String sourceIntro;
	private Integer sourceLevel;
	private Integer sourceScore;

	public SourceView(Source source, boolean isChinese) {
		this.sourceId = source.getSourceId();
		this.sourceLevel = source.getSourcelevel();
		this.sourceScore = source.getSourcescore();
		if(isChinese) {
			this.sourceName = source.getSourcenameC();
			this.sourceIntro = source.getSourceintroC();
		} else {
			this.sourceName = source.getSourceintroE();
			this.sourceIntro = source.getSourceintroE();
		}
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public String getSourceIntro() {
		return sourceIntro;
	}

	public Integer getSourceLevel() {
		return sourceLevel;
	}

	public Integer getSourceScore() {
		return sourceScore;
	}
}
