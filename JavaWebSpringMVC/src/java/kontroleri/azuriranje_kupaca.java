
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
public class azuriranje_kupaca {
    
        
            @RequestMapping(value = "/azuriraj_kupca", method = RequestMethod.GET)
       public String azuKupca( ModelMap model) {
            model.addAttribute("kupci1",new Kupci() );
              return "azuriraj_kupca";
}
       
           @RequestMapping(value="/azuriraj_kupca",method=RequestMethod.POST)     
       public String izmena(@ModelAttribute("kupci1") @Valid Kupci kupci1,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "azuriraj_kupca";
               }
     
                        
        kupci1.azuriranje();
        azuKupca(model);
                return "azuriraj_kupca";              
}
    
}
