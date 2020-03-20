package fr.insee.queen.queen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Operation {
	@Id
	@Column(length=50)
	private String id;
	@Column(length=255, nullable = false)
	private String label;
	 
	@ManyToOne
	private QuestionnaireModel questionnaireModel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public QuestionnaireModel getQuestionnaireModel() {
		return questionnaireModel;
	}
	public void setQuestionnaireModel(QuestionnaireModel questionnaireModel) {
		this.questionnaireModel = questionnaireModel;
	}
}
