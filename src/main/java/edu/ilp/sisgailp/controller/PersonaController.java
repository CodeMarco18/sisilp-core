package edu.ilp.sisgailp.controller;



import edu.ilp.sisgailp.entity.Persona;
import edu.ilp.sisgailp.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersonas")
    public List<Persona> listaPersonas(){
        return this.personaService.listarPersonas();
    }


    @GetMapping("/buscarPersonaByCodigo")
    public Persona buscarPersonaByCodigo(@RequestParam String dni){
        return this.personaService.obtenerPersonaPorDni(dni);
    }



    /* ⠀ __
         |  ""--.--.._                                             __..    ,--.
         |       `.   "-.'""\_...-----..._   ,--. .--..-----.._.""|   |   /   /
         |_   _    \__   ).  \           _/_ |   \|  ||  ..    >  `.  |  /   /
           | | `.   ._)  /|\  \ .-"""":-"   "-.   `  ||  |.'  ,'`. |  |_/_  /
           | |_.'   |   / ""`  \  ===/  ..|..  \     ||      < ""  `.  "  |/__
           `.      .    \ ,--   \-..-\   /"\   /     ||  |>   )--   |    /    |
            |__..-'__||__\   |___\ __.:-.._..-'_|\___||____..-/  |__|--""____/
                                  _______________________
                                 /                      ,'
                                /      ___            ,'
                               /   _.-'  ,'        ,-'   /
                              / ,-' ,--.'        ,'   .'/
                             /.'     `.         '.  ,' /
                            /      ,-'       ,"--','  /
                                 ,'        ,'  ,'    /
                                ,-'      ,' .-'     /
                             ,-'                   /
                           ,:________________Marco/⠀  */


    @GetMapping("/saludo")
    public String saludo(){
        return "Hola amig@s desde Persona ";
    }
}
