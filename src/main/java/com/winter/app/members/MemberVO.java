package com.winter.app.members;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {
	
	@NotBlank
	private String username;
	@NotBlank
	@Size(min =6, max = 8)
	private String password;
	
	
	private String passwordCheck;
	@NotBlank
	private String name;
	@Email
	private String email;
	//@Pattern(regexp = "")
	private String phone;
	@NotNull
	@Past
	private LocalDate birth;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;

	private ProfileVO profileVO;
	
	private List<RoleVO> roleVOs;
	
}
