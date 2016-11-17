package com.example.exampleservice.data;

import javax.persistence.*;

@Entity
@Table(name = "EXAMPLE")
public class ExampleBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String data;


	// for JPA to work
	public ExampleBean() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
