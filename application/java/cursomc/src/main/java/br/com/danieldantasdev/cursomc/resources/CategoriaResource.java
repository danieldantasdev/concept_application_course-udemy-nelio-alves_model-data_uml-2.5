package br.com.danieldantasdev.cursomc.resources;

import br.com.danieldantasdev.cursomc.domains.CategoriaDomain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
    @RequestMapping(method = RequestMethod.GET)
    public List<CategoriaDomain> listar() {
        CategoriaDomain categoriaDomain1 = new CategoriaDomain(1, "Informática");
        CategoriaDomain categoriaDomain2 = new CategoriaDomain(2, "Escritório");

        List<CategoriaDomain> categoriaDomains = new ArrayList<>();
        categoriaDomains.add(categoriaDomain1);
        categoriaDomains.add(categoriaDomain2);

        return categoriaDomains;
    }
}
