package VO;

import java.io.NotSerializableException;

public class jobCategoryVO extends NotSerializableException {
	
	private int Cat_ID;
	private String cat_name, cat_dis;
	public int getCat_ID() {
		return Cat_ID;
	}
	public void setCat_ID(int cat_ID) {
		Cat_ID = cat_ID;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getCat_dis() {
		return cat_dis;
	}
	public void setCat_dis(String cat_dis) {
		this.cat_dis = cat_dis;
	}

}
