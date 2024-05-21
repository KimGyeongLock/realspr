package com.thc.realspr.dto;

import com.thc.realspr.domain.Tbuser;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

public class TbuserDto {

	/**/

	@Schema
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class TbuserCreateDto {
		@Schema(description = "username", example="이메일 주소")
		@NotNull
		@Email
		@NotEmpty
		@Size(max=100)
		private String username;

		@Schema(description = "password", example="비밀번호")
		@NotNull
		@NotEmpty
		@Size(max=50)
		private String password;

		public Tbuser toEntity() {
			return Tbuser.of(username, password);
		}
	}


	@Schema
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	public static class TbuserAfterCreateDto {
		@Schema(description = "id", example="length32textnumber")
		private String id;
	}

	@Schema
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class TbuserSelectDto {
		@Schema(description = "id", example="")
		private String id;
		@Schema(description = "username", example="이메일 주소")
		private String username;
		@Schema(description = "name", example="")
		private String name;
	}
}