package VO;


import java.io.NotSerializableException;

public class userVO extends NotSerializableException {
	private int User_ID;
	private String User_E_id, password, User_Fname, User_Lname, Address, PH_no, MO_no, hint_que, hint_ans, Activation;
	private roleVO Role_ID;
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public String getUser_E_id() {
		return User_E_id;
	}
	public void setUser_E_id(String user_E_id) {
		User_E_id = user_E_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_Fname() {
		return User_Fname;
	}
	public void setUser_Fname(String user_Fname) {
		User_Fname = user_Fname;
	}
	public String getUser_Lname() {
		return User_Lname;
	}
	public void setUser_Lname(String user_Lname) {
		User_Lname = user_Lname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPH_no() {
		return PH_no;
	}
	public void setPH_no(String pH_no) {
		PH_no = pH_no;
	}
	public String getMO_no() {
		return MO_no;
	}
	public void setMO_no(String mO_no) {
		MO_no = mO_no;
	}
	public String getHint_que() {
		return hint_que;
	}
	public void setHint_que(String hint_que) {
		this.hint_que = hint_que;
	}
	public String getHint_ans() {
		return hint_ans;
	}
	public void setHint_ans(String hint_ans) {
		this.hint_ans = hint_ans;
	}
	public String getActivation() {
		return Activation;
	}
	public void setActivation(String activation) {
		Activation = activation;
	}
	public roleVO getRole_ID() {
		return Role_ID;
	}
	public void setRole_ID(roleVO role_ID) {
		Role_ID = role_ID;
	}
	
	
}
