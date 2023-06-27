package com.labsession;

class Ittem {
	private int iid;
	private String iname;
	private int iprice;

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public int getIprice() {
		return iprice;
	}

	public void setIprice(int iprice) {
		this.iprice = iprice;
	}

	@Override
	public String toString() {
		return "Ittem [iid=" + iid + ", iname=" + iname + ", iprice=" + iprice + "]";
	}
	
	

}

public class Supplier {

	private int id;
	private String name;
	private Ittem itm;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ittem getItm() {
		return itm;
	}

	public void setItm(Ittem itm) {
		this.itm = itm;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", itm=" + itm + "]";
	}
	
	

}
