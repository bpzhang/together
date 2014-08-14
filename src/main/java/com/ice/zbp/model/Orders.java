package com.ice.zbp.model;

public class Orders {
    private Integer dishesid;

    private String orderquantity;

    private String ordertime;

    private String phone;

    private String address;

    public Integer getDishesid() {
        return dishesid;
    }

    public void setDishesid(Integer dishesid) {
        this.dishesid = dishesid;
    }

    public String getOrderquantity() {
        return orderquantity;
    }

    public void setOrderquantity(String orderquantity) {
        this.orderquantity = orderquantity == null ? null : orderquantity.trim();
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}