package model;

/**
 * Created by KPS on 7/18/2020.
 */
public class Button {
    private String name;
    private String color;
    private OnClick onClick;

    public Button() {
    }

    public Button(String name, String color, OnClick onClick) {
        this.name = name;
        this.color = color;
        this.onClick = onClick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public OnClick getOnClick() {
        return onClick;
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }
    public void click(){
         getOnClick().clicking();
    }
}
