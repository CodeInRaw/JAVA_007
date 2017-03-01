package no.itera.shop.actions;

/**
 * Created by Ihor Ruskykh on 3/1/2017.
 */
public class MainMenu implements Action{
    @Override
    public void showPrompt() {
        String prompt = "1. Product list\n" +
                        "4. Exit";
        System.out.println(prompt);
    }

    @Override
    public Action perform(int i) {

        switch ( i ){
            case 1:
                return new ProductList();
            case 4:
                System.out.println("Exit");
                System.exit(0);
            default:
                return this;

        }
    }
}
