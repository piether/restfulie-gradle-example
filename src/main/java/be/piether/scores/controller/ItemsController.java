package be.piether.scores.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import static br.com.caelum.vraptor.view.Results.xml;

@Resource
public class ItemsController {
    
     private final Result result;
     private final Database database;

     public ItemsController(Result result){
        this.result = result;
        this.database = new Database();
     }
     
     @Get
     @Path("/items")
     public void list(){
        result.use(xml()).from(database.getItems()).serialize();
     }

     @Get
     @Path("/items/{id}")
     public void show(Integer id){
        //because list are zero-baed
        Item item = database.getItem(id);
        result.use(xml()).from(item).serialize();
     }

}