package zdp.springframework.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zachary D. Smith on 1/15/2019
 */
@RestController
public class IndexController {

    private final RecipeService

    @RequestMapping("/categories")
    public String getCategory(Model model) {
        model.addAttribute("recipes", )
        return "/category/index";
    }
}
