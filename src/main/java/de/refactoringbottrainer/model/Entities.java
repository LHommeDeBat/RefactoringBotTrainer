
package de.refactoringbottrainer.model;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refactoring",
    "refactoringString",
    "javaAnnotations"
})
public class Entities {

    @JsonProperty("refactoring")
    private List<WitEntity> refactoring = new ArrayList<WitEntity>();
    @JsonProperty("refactoringString")
    private List<WitEntity> refactoringString = new ArrayList<WitEntity>();
    @JsonProperty("javaAnnotations")
    private List<WitEntity> javaAnnotations = new ArrayList<WitEntity>();

    @JsonProperty("refactoring")
    public List<WitEntity> getRefactoring() {
        return refactoring;
    }

    @JsonProperty("refactoring")
    public void setRefactoring(List<WitEntity> refactoring) {
        this.refactoring = refactoring;
    }

    @JsonProperty("refactoringString")
    public List<WitEntity> getRefactoringString() {
        return refactoringString;
    }

    @JsonProperty("refactoringString")
    public void setRefactoringString(List<WitEntity> refactoringString) {
        this.refactoringString = refactoringString;
    }
    
    @JsonProperty("javaAnnotations")
    public List<WitEntity> getJavaAnnotations() {
    return javaAnnotations;
    }

    @JsonProperty("javaAnnotations")
    public void setJavaAnnotations(List<WitEntity> javaAnnotations) {
    this.javaAnnotations = javaAnnotations;
    }

}
