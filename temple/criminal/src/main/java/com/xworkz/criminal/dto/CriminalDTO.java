package com.xworkz.criminal.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "criminal")
@NamedQuery(name = "findByName", query = "select killer from CriminalDTO killer where "
		+ "(:nm is null or killer.name=:nm) or" + " (:jl is null or killer.jailName=:jl)")
//@NamedQuery(name = "findByJailName", query = "select killer from CriminalDTO killer where killer.jailName=:jl")
public class CriminalDTO extends AbstractDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String crime;
	private String aliasName;
	private String jailName;
	private String description;
	private String fileName;
	private long fileSize;
	private String contentType;

	public CriminalDTO() {
		System.out.println("Calling default in DTO");
	}

	public CriminalDTO(String name, String crime, String aliasName, String jailName, String description,
			String fileName, long fileSize, String contentType) {
		super();
		this.name = name;
		this.crime = crime;
		this.aliasName = aliasName;
		this.jailName = jailName;
		this.description = description;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.contentType = contentType;
	}

	@Override
	public String toString() {
		return "CriminalDTO [id=" + id + ", name=" + name + ", crime=" + crime + ", aliasName=" + aliasName
				+ ", jailName=" + jailName + ", description=" + description + ", fileName=" + fileName + ", fileSize="
				+ fileSize + ", contentType=" + contentType + ", getCreatedBy()=" + getCreatedBy()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getJailName() {
		return jailName;
	}

	public void setJailName(String jailName) {
		this.jailName = jailName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
