package com.skyzer.server.main.bean;

public class Reference_Guide_Sub_Category {

	private Integer id;
	private String name;
	private Reference_Guide_Category reference_guide_category;
	private User created_by;
	private String created_on;
	private User updated_by;
	private String updated_on;
	
	public Reference_Guide_Sub_Category() {
	}
	public Reference_Guide_Sub_Category(Integer id, String name, Reference_Guide_Category reference_guide_category, User created_by,
			String created_on, User updated_by, String updated_on) {
		super();
		this.id = id;
		this.name = name;
		this.reference_guide_category = reference_guide_category;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reference_Guide_Category getReference_guide_category() {
		return reference_guide_category;
	}
	public void setReference_guide_category(Reference_Guide_Category reference_guide_category) {
		this.reference_guide_category = reference_guide_category;
	}
	public User getCreated_by() {
		return created_by;
	}
	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public User getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(User updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}
}