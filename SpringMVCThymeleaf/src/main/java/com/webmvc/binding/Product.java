package com.webmvc.binding;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Product {
	@NotNull(message="Product ID is required")
	private Integer pid;
	@NotNull(message="Product Name is required")
	private String pname;
	@NotNull(message="Product Price is required")
	private Integer price;
}
