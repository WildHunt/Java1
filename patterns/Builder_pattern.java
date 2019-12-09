package patterns;

import java.util.Set;

public class Builder_pattern {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Builder_pattern> parents;

    public static class Builder {
        private Builder_pattern newPerson;

        public Builder() {
            newPerson = new Builder_pattern();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Builder_pattern> parents){
            newPerson.parents = parents;
            return this;
        }

        public Builder_pattern build(){
            return newPerson;
        }

    }

    public static void main(String[] args) {
        Builder_pattern myPerson = new Builder_pattern.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
    }
}
