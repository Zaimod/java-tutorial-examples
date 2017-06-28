package org.o7planning.servletexamples.model;

import java.sql.Blob;

public class Attachment {
	private long id;
	private String fileName;
	private Blob fileData;
	private String description;
	
	public Attachment(long id, String fileName, Blob fileData, String description) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.fileData = fileData;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileData
	 */
	public Blob getFileData() {
		return fileData;
	}

	/**
	 * @param fileData the fileData to set
	 */
	public void setFileData(Blob fileData) {
		this.fileData = fileData;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

}
