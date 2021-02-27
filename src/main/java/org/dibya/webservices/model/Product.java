package org.dibya.webservices.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "type", "price", "shipping", "upc", "description", "manufacturer", "model", "url",
		"image" })
public class Product {

	@JsonProperty("name")
	private String name;
	@JsonProperty("type")
	private String type;
	@JsonProperty("price")
	private Integer price;
	@JsonProperty("shipping")
	private Integer shipping;
	@JsonProperty("upc")
	private String upc;
	@JsonProperty("description")
	private String description;
	@JsonProperty("manufacturer")
	private String manufacturer;
	@JsonProperty("model")
	private String model;
	@JsonProperty("url")
	private String url;
	@JsonProperty("image")
	private String image;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("price")
	public Integer getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Integer price) {
		this.price = price;
	}

	@JsonProperty("shipping")
	public Integer getShipping() {
		return shipping;
	}

	@JsonProperty("shipping")
	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}

	@JsonProperty("upc")
	public String getUpc() {
		return upc;
	}

	@JsonProperty("upc")
	public void setUpc(String upc) {
		this.upc = upc;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("manufacturer")
	public String getManufacturer() {
		return manufacturer;
	}

	@JsonProperty("manufacturer")
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@JsonProperty("model")
	public String getModel() {
		return model;
	}

	@JsonProperty("model")
	public void setModel(String model) {
		this.model = model;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(String image) {
		this.image = image;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}