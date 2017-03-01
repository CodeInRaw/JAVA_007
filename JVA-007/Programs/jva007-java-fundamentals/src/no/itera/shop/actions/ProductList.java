package no.itera.shop.actions;

import no.itera.shop.db.Model;
import no.itera.shop.domain.Product;

/**
 * Created by ptcvas13 on 3/1/2017.
 */
public class ProductList implements Action {
    @Override
    public void showPrompt() {
        System.out.println("******Product List******");
        for ( int i = 0; i < Model.getInstance().getProducts().size(); i++ ){
            Product p = Model.getInstance().getProducts().get(i);
            System.out.println(p.getName()+ " : " + p.getPrice());
        }

        System.out.println("0. MainMenu");

    }

    @Override
    public Action perform(int i) {
        if (i == 0) return new MainMenu();



        return this;
    }
}
