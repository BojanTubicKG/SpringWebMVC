package kontroleri;

import javax.validation.Valid;
import modeli.Proizvodi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Dodavanje_proizvoda {

        
            @RequestMapping(value = "/dodaj_proizvod", method = RequestMethod.GET)
       public String dodajProizvod( ModelMap model) {
            model.addAttribute("proizvodi",new Proizvodi() );
              return "dodaj_proizvod";
}
       
           @RequestMapping(value="/dodaj_proizvod",method=RequestMethod.POST)     
       public String dodavanja(@ModelAttribute("proizvodi") @Valid Proizvodi proizvodi,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "dodaj_proizvod";
               }
     
                        
        proizvodi.dodavanje();
        dodajProizvod(model);
        return "dodaj_proizvod";              
}
}
