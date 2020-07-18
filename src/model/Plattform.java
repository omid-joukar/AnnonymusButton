package model;

/**
 * Created by KPS on 7/18/2020.
 */
public class Plattform {
    private Button button;

    public Plattform(Button button) {
        this.button = button;
        button.setOnClick(new OnClick() {
            @Override
            public void clicking() {
                System.out.println(" someone has clicked");
            }
        });
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
