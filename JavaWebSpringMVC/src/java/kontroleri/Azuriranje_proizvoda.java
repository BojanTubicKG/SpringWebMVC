
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
public class Azuriranje_proizvoda {
        
            @RequestMapping(value = "/azuriraj_proizvod", method = RequestMethod.GET)
       public String azuProizvod( ModelMap model) {
            model.addAttribute("proizvodi1",new Proizvodi() );
              return "azuriraj_proizvod";
}
       
           @RequestMapping(value="/azuriraj_proizvod",method=RequestMethod.POST)     
       public String izmena(@ModelAttribute("proizvodi1") @Valid Proizvodi proizvodi1,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "azuriraj_proizvod";
               }
     
                        
        proizvodi1.azuriranje();
        azuProizvod(model);
                return "azuriraj_proizvod";              
}    
}
