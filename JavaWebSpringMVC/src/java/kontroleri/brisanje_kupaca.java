
package kontroleri;

import modeli.Kupci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class brisanje_kupaca {
    
                @RequestMapping(value = "/obrisi_kupca", method = RequestMethod.GET)
       public String obKupca( ModelMap model) {
            model.addAttribute("kupci2",new Kupci() );
              return "obrisi_kupca";
}
       
           @RequestMapping(value="/obrisi_kupca",method=RequestMethod.POST)     
       public String brisanje1(@ModelAttribute("kupci2") Kupci kupci2,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "obrisi_kupca";
               }
     
                        
        kupci2.brisanje();
        obKupca(model);
        return "obrisi_kupca";              
}
    
}
