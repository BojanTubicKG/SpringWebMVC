
package kontroleri;

import javax.validation.Valid;
import modeli.Prodaja;
import modeli.Proizvodi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Kupovina {
    
        
            @RequestMapping(value = "/dodaj_prodaju", method = RequestMethod.GET)
       public String dodajKupovinu( ModelMap model) throws ClassNotFoundException {
            model.addAttribute("prodaja",new Prodaja());
            model.addAttribute("listaa",Proizvodi.listaProizvoda());
            
              return "dodaj_prodaju";
}
       
           @RequestMapping(value="/dodaj_prodaju",method=RequestMethod.POST)     
       public String dodavanja(@ModelAttribute("prodaja") @Valid Prodaja prodaja,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "dodaj_prodaju";
               }
     
                        
        prodaja.kupovina();
        prodaja.azu();
        dodajKupovinu(model);
        return "dodaj_prodaju";              
}
    
}
