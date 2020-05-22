package com.abc.recyclerview;

public class MySource extends Source {

//    private String title;
//    private int image;
//    private String name;

    public MySource(String title, int image) {
    super(title, image);
}
    @Override
    public String getTitle(){
        return super.getTitle() + " Luis";
    }
}