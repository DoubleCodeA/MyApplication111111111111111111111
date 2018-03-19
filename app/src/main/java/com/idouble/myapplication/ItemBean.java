package com.idouble.myapplication;

/**
 * Created by Administrator on 2018/3/19.
 */

public class ItemBean {

    private int itemImage;

    private String itemTitle;

    private String itemContent;

    public ItemBean(int itemImage, String itemTitle, String itemContent){

        this.itemImage = itemImage;
        this.itemTitle = itemTitle;
        this.itemContent = itemContent;

    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }
}
