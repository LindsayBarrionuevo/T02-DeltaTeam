/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadoMenu.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Customer {
    private String order;
    private float orderCost;
    private String name;

    public Customer(String order, float orderCost, String name) {
        this.order = "";
        this.orderCost = 0;
        this.name = "";
    }
        public Customer() {
        order = "";
        orderCost = 0;
        name = "";
    }

    /**
     * @return the order
     */
    public String getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * @return the orderCost
     */
    public float getOrderCost() {
        return orderCost;
    }

    /**
     * @param orderCost the orderCost to set
     */
    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
