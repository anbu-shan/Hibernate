package org.auth;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile")
public class UserProfile {

	@ManyToMany
	@JoinTable(name="user_prof_credentials",
				joinColumns=@JoinColumn(name="prof_id"),
				inverseJoinColumns=@JoinColumn(name="username"))
	private Set<UserCredential> credentials = new HashSet<UserCredential>();

	public Set<UserCredential> getCredentials() {
		return credentials;
	}

	public void setCredentials(Set<UserCredential> credentials) {
		this.credentials = credentials;
	}

	@Id
	@GeneratedValue
	@Column(name = "prof_id")
	private int profileId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "phone_no")
	private String phoneNo;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
