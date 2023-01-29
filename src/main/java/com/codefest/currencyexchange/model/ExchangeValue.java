package com.codefest.currencyexchange.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private Double conversionMultiple;
	private int port;
	
	public ExchangeValue() {}
	
	public ExchangeValue(Long id, String from, String to, double i) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = i;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}
	
	

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + "]";
	}
	
	

}
