package com.galaxe.crsm.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private String emp_name;
	private String emp_id;
	private String emp_account;
	private String emp_password;
	private String emp_role;
}
