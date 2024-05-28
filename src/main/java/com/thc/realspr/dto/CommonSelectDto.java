package com.thc.realspr.dto;

import com.thc.realspr.domain.Tbpost;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Schema
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonSelectDto {
	@Schema(description = "id", example="")
	private String id;
	@Schema(description = "deleted", example="")
	private String deleted;
	@Schema(description = "createdAt", example="")
	private String createdAt;
	@Schema(description = "modifiedAt", example="")
	private String modifiedAt;
}