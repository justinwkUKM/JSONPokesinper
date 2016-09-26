package com.myxlab.jsonpokesinper;

/**
 * Created by haslina on 9/26/2016.
 */
public class PokeSniperData {

    //declare your variables
   private String imageURL, title, coord;

    //create an empty constructor
    public PokeSniperData() {
    }

    //create getter&setter methods


    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoord() {
        return coord;
    }

    public void setCoord(String coord) {
        this.coord = coord;
    }
}
