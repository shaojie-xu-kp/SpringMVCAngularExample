package com.infinitagroup.www.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Long id;

    private String name;
    
    private String surname;
    
    private Date birthday;

    private String email;

    private String gender;
    
    private String password;
    
    private String type;
    
    private String tag;
    
    private Date lastLogin; 
    
    private double longinCounter;
    
    private Date updated;
    
    private Date added;
        
    private String website;
    
    private Boolean newsletterBlacklist = false;
    
    private String status;
    
    private Integer globalId;
    
    
    public static class CustomerBuilder {
        
    	public Long id;
        
		private String password;

    	private String email;
    	
    	private String name;
    	
    	private String surname;
    	
    	private Date birthday;
    	
        private String gender;
        
        private String type;
        
        private String website;
            	
    	public CustomerBuilder (long id , String email, String password){
    		this.id = id;
    		this.email = email;
    		this.password = password;
    	}
    	
		public CustomerBuilder withFirstName(String name) {
			this.name = name;
			return this;
		}
		
		public CustomerBuilder withLastName(String surname) {
			this.surname = surname;
			return this;
		}

		public CustomerBuilder withBirthday(Date birthday) {
			this.birthday = birthday;
			return this;
		}

		public CustomerBuilder withGender(String gender) {
			this.gender = gender;
			return this;
		}

		public CustomerBuilder withType(String type) {
			this.type = type;
			return this;
		}
		
		public CustomerBuilder withWebsite(String website){
			this.website = website;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}

    	
    }


	public Customer(CustomerBuilder builder) {
		
		this.id = builder.id;
		this.password = builder.password;
		this.email = builder.email;
		this.name = builder.name;
		this.surname = builder.surname;
		this.birthday = builder.birthday;
		this.gender = builder.gender;
		this.type = builder.type;
		this.website = builder.website;
	}
	
	public Customer(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public double getLonginCounter() {
		return longinCounter;
	}

	public void setLonginCounter(double longinCounter) {
		this.longinCounter = longinCounter;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}
    
    public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public Boolean getNewsletterBlacklist() {
		return newsletterBlacklist;
	}

	public void setNewsletterBlacklist(Boolean newsletterBlacklist) {
		this.newsletterBlacklist = newsletterBlacklist;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getGlobalId() {
		return globalId;
	}

	public void setGlobalId(Integer globalId) {
		this.globalId = globalId;
	}	
	
	public String toString(){
		return String.format("[ %s %s %s %s %s]", this.name, this.surname, this.email, this.gender, this.birthday == null ? " " : this.birthday.toString());
	}

}
