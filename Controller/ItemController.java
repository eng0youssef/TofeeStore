/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.ArrayList;
import Model.Item;


/**
 *
 * @author Omnia
 */


public class ItemController {
    private ArrayList<Item> items;

    public ItemController() {
        this.items = new ArrayList<Item>();
    }

    public void addItems() {
        

this.items.add(new Item("Chocolate Cake", "Cakes", "Rich chocolate cake with layers of creamy chocolate frosting", "chocolate_cake.jpg", "Toffee Bakery", 15.99, 0.0));
this.items.add(new Item("Vanilla Cupcake", "Cupcakes", "Moist vanilla cake topped with fluffy vanilla buttercream", "vanilla_cupcake.jpg", "Toffee Bakery", 2.99, 2));
this.items.add(new Item("Chocolate Chip Cookie", "Cookies", "Classic chocolate chip cookie with crispy edges and a chewy center", "chocolate_chip_cookie.jpg", "Toffee Bakery", 1.99, 0));
this.items.add(new Item("Blueberry Muffin", "Muffins", "Freshly baked muffin bursting with blueberries and a buttery crumb topping", "blueberry_muffin.jpg", "Toffee Bakery", 3.49, 0));
this.items.add(new Item("Cinnamon Roll", "Pastries", "Flaky pastry dough swirled with cinnamon sugar and drizzled with vanilla icing", "cinnamon_roll.jpg", "Toffee Bakery", 4.99, 0));
this.items.add(new Item("Chocolate Chip Cookies", "Bakery", "Delicious cookies with chunks of chocolate chips", "cookie.jpg", "Toffee Bakery", 2.99, 0.0));
this.items.add(new Item("Gluten-Free Bread", "Bakery", "Soft and tasty gluten-free bread", "bread.jpg", "Toffee Bakery", 4.99,0 ));
  }

   public ArrayList<Item> getItems() {
        return this.items;
    }
}
