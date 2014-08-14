package com.ice.zbp.model;

public class Disheses {
    private Integer dishesid;

    private String dishesname;

    private String ingredient;

    private String effect;

    private String credits;

    private String amt;

    private String pictureid;

    public Integer getDishesid() {
        return dishesid;
    }

    public void setDishesid(Integer dishesid) {
        this.dishesid = dishesid;
    }

    public String getDishesname() {
        return dishesname;
    }

    public void setDishesname(String dishesname) {
        this.dishesname = dishesname == null ? null : dishesname.trim();
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient == null ? null : ingredient.trim();
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits == null ? null : credits.trim();
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt == null ? null : amt.trim();
    }

    public String getPictureid() {
        return pictureid;
    }

    public void setPictureid(String pictureid) {
        this.pictureid = pictureid == null ? null : pictureid.trim();
    }
}