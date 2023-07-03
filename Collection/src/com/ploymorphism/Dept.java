package com.ploymorphism;
import java.util.*;

class Employe{
	
	int eid;
	String ename;
	int esal;
	public Employe(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}

public class Dept {
	
	int id;
	String name;
	ArrayList<Employe>list;
	public Dept(int id, String name, ArrayList<Employe> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	
	
	
	
	

	
}
