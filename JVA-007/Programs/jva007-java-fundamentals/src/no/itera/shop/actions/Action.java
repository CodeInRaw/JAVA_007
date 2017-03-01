package no.itera.shop.actions;

/**
 * Created by Ihor Ruskykh on 3/1/2017.
 */
public interface Action {
    void showPrompt();
    Action perform(int i);
}
