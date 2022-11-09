package com.fydhos.tsj97.hotel_sec.room_desing_sec;

public class data_process {

    String  image,hotel_name,loc_for_hot,offer;

    public data_process(String image, String hotel_name, String loc_for_hot, String offer){
        this.image = image;
        this.hotel_name = hotel_name;
        this.loc_for_hot = loc_for_hot;
        this.offer = offer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getLoc_for_hot() {
        return loc_for_hot;
    }

    public void setLoc_for_hot(String loc_for_hot) {
        this.loc_for_hot = loc_for_hot;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
}
