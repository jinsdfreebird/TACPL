package VO;

public class candidateRegistratioVO {
	private String Cndt_Resume,Cndt_Refrence;
	private int Cndt_ID;
	private jobCategoryVO Cat_ID;
	private userVO User_ID;
	public String getCndt_Resume() {
		return Cndt_Resume;
	}
	public void setCndt_Resume(String cndt_Resume) {
		Cndt_Resume = cndt_Resume;
	}
	public String getCndt_Refrence() {
		return Cndt_Refrence;
	}
	public void setCndt_Refrence(String cndt_Refrence) {
		Cndt_Refrence = cndt_Refrence;
	}
	public int getCndt_ID() {
		return Cndt_ID;
	}
	public void setCndt_ID(int cndt_ID) {
		Cndt_ID = cndt_ID;
	}
	public jobCategoryVO getCat_ID() {
		return Cat_ID;
	}
	public void setCat_ID(jobCategoryVO cat_ID) {
		Cat_ID = cat_ID;
	}
	public userVO getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(userVO user_ID) {
		User_ID = user_ID;
	}
	
}
