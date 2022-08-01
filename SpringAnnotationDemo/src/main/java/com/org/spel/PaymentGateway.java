package com.org.spel;

public class PaymentGateway {
	private String itemName;
    
    private Order order;
     
    public void setOrder(Order ord){
        this.order = ord;
    }
     
    public String getItemName() {
        return itemName;
    }
 
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
  
    public Order getOrder() {
        return order;
    }
 
    public void processOrder(){
        System.out.println("Processing order: "+order.getItem());
    }
}
