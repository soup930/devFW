package project.hm.hmp001_d003.vo;

import org.springframework.stereotype.Component;

@Component("hmp001_d003VO")
public class Hmp001_d003VO {
	private String id = "";
	private String name = "";
	private double price = 0;
	private String desc = "";
	private String vend_name = "";
	
	public Hmp001_d003VO(){}
	
//	public Hmp001_d003VO(String id, String name, double price, String desc, String vend_name) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//		this.desc = desc;
//		this.vend_name = vend_name;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getdesc() {
		return desc;
	}

	public void setdesc(String desc) {
		this.desc = desc;
	}

	public String getVend_name() {
		return vend_name;
	}

	public void setVend_name(String vend_name) {
		this.vend_name = vend_name;
	}
	
}
