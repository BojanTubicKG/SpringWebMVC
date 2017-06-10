
package kontroleri;

import javax.validation.Valid;
import modeli.Kupci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class dodavanje_kupca {
    
            @RequestMapping(value = "/dodaj_kupca", method = RequestMethod.GET)
       public String dodajKupca( ModelMap model) {
            model.addAttribute("kupci",new Kupci() );
              return "dodaj_kupca";
}
       
           @RequestMapping(value="/dodaj_kupca",method=RequestMethod.POST)     
       public String dodavanja(@ModelAttribute("kupci") @Valid Kupci kupci,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "dodaj_kupca";
               }
     
                        
        kupci.dodavanje();
        dodajKupca(model);
        return "dodaj_kupca";              
}
    
}
