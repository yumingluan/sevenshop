package com.seven.entity;

public class Personinfo {
    private Integer id;

    private Integer userid;

    private String adress;

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

	@Override
	public String toString() {
		return "Personinfo [id=" + id + ", userid=" + userid + ", adress=" + adress + ", phone=" + phone + "]";
	}
    
    
}