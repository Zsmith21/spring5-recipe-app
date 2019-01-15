package zdp.springframework.model;

import javax.persistence.*;

/**
 * Created by Zachary D. Smith on 1/12/2019
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getNote() {
        return this.recipeNotes;
    }

    public void setNote(String note) {
        this.recipeNotes = note;
    }
}
