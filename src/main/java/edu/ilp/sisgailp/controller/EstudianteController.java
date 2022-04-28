package edu.ilp.sisgailp.controller;

import edu.ilp.sisgailp.entity.Estudiante;
import edu.ilp.sisgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/listaEstudiante")
    public List<Estudiante> listaEstudiantes(){

        return this.estudianteService.listarEstudiantes();
    }

    @GetMapping("/buscarEstudianteByCodigo")
    public  Estudiante buscarEstudianteByCodigo(@RequestParam Long codigo) {
        return this.estudianteService.obtenerEstudiantePorCodigo(codigo);
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
        return "Hola amig@s desde Estudiante ";
    }
}
