package VO;

public class keywordVO {
	private int KW_ID;
	private String Keyword;
	private jobCategoryVO Cat_ID;
	public int getKW_ID() {
		return KW_ID;
	}
	public void setKW_ID(int kW_ID) {
		KW_ID = kW_ID;
	}
	public String getKeyword() {
		return Keyword;
	}
	public void setKeyword(String keyword) {
		Keyword = keyword;
	}
	public jobCategoryVO getCat_ID() {
		return Cat_ID;
	}
	public void setCat_ID(jobCategoryVO cat_ID) {
		Cat_ID = cat_ID;
	}
}
