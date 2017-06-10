
package kontroleri;

import modeli.Proizvodi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BrisanjeProizvoda {
    
                    @RequestMapping(value = "/obrisi_proizvod", method = RequestMethod.GET)
       public String obProizvod( ModelMap model) {
            model.addAttribute("proizvodi2",new Proizvodi() );
              return "obrisi_proizvod";
}
       
           @RequestMapping(value="/obrisi_proizvod",method=RequestMethod.POST)     
       public String brisanje1(@ModelAttribute("proizvodi2") Proizvodi proizvodi2,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "obrisi_proizvod";
               }
     
                        
        proizvodi2.brisanje();
        obProizvod(model);
        return "obrisi_proizvod";              
}
    
}
