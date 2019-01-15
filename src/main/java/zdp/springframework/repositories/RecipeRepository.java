package zdp.springframework.repositories;

import zdp.springframework.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zachary D. Smith on 1/14/2019
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
