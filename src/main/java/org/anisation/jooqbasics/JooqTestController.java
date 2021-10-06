package org.anisation.jooqbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JooqTestController extends DbAccess{

    @GetMapping("/")
    public String jooqQueries() throws Exception{


        return someDbAccess();

    }
    /*
        @RequestMapping(value = "/error", method = RequestMethod.GET)
        public String errorScreen(){

            return "error";
        }
*/
}