package com.galaxe.crsm.userservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private int user_id;

	@Column
	private String emp_name;
	@Column
	private String emp_id;
	@Column
	private String emp_account;
	@Column
	private String emp_password;
	@Column
	private String emp_role;

}
