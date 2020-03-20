package fr.insee.queen.queen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table
@TypeDef(
	    name = "jsonb",
	    typeClass = JsonBinaryType.class
	)
public class Nomenclature {
	
	@Id
	@Column(length=50)
	private String id;
	@Column(length=255, nullable = false)
	private String label;
	
	@Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
	private String value;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
