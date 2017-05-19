package sample.code.blog;
// Generated 18 May, 2017 2:40:30 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name = "person", catalog = "blog")
public class Person implements java.io.Serializable {

	private Integer id;
	private String country;
	private String name;
	private String adress;
	private Integer age;

	public Person() {
	}

	public Person(String country, String name, String adress, Integer age) {
		this.country = country;
		this.name = name;
		this.adress = adress;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "COUNTRY", length = 30)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "NAME", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ADRESS", length = 90)
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Column(name = "AGE")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}