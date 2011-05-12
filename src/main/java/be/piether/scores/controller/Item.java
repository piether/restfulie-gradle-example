package be.piether.scores.controller;

import br.com.caelum.vraptor.restfulie.hypermedia.HypermediaResource;
import br.com.caelum.vraptor.restfulie.relation.RelationBuilder;

public class Item implements HypermediaResource {

    private Integer id;
    private String name;
    private Double price;

    public Item(Integer id, String name, Double price){
       this.id = id;
       this.name = name;
       this.price = price; 
    }

   public void configureRelations(RelationBuilder builder) {
        builder.relation("self").uses(ItemsController.class).show(id);
   }
   }    