/**
 * 
 */
package viveksingh.restful.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author vivek_xz2hujv
 *
 */
@ApiModel(description = "User bean description.")
@JsonIgnoreProperties("someDummyData") // this is class level configuration defines all properties to be ignored.
@Entity
@Table(name="T_USER", schema="schema")
public class User {

	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private Integer id;

	@Size(min = 3, max = 20, message = "Name must be between 3 to 20 character.")
	@ApiModelProperty(notes = "Length should be min 3 chars or max 20 chars.")
	@Column(name="USER_NAME")
	private String name;

	@JsonIgnore // This will instruct JSON processor to ignore this in response.
	@Past(message = "BirthDate cannot be today or future date.")
	@ApiModelProperty(notes = "DB should a past date.")
	@Column(name="DOB")
	private Date birthDate;

	// Some dummy data for @JsonIgnoreProperties test.
	@Column(name="DUMMY_DATA")
	private String someDummyData = "No to send in JSON response";

	/**
	 * Default Constructor for bean creation support.
	 */
	public User() {
	}

	/**
	 * @param id
	 * @param name
	 * @param birthDate
	 */
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the someDummyData
	 */
	public String getSomeDummyData() {
		return someDummyData;
	}

	/**
	 * @param someDummyData the someDummyData to set
	 */
	public void setSomeDummyData(String someDummyData) {
		this.someDummyData = someDummyData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}
}
