package excercise_1;

public enum Wardrobe {
    BLOUSE("Crop Top","A blue top made of wool",1){
        @Override
        public String showGarmentDescription() {
            return "Remember that you can`t put it in the dryer";
        }
    },
    JEAN("Skinny jeans","A black skinny jean slimmer",2){
        @Override
        public String showGarmentDescription() {
            return "You can`t put it in the dryer and iron it at a\n temperature of 80 grades";
        }
    },
    TSHIRT("Sporty","White body shaping t-shirt",3){
        @Override
        public String showGarmentDescription() {
            return "Don`t wash with chlorine, use mild detergent";
        }
    },
    SHIRT("Elegant","An elegant passion red shirt",4){
        @Override
        public String showGarmentDescription() {
            return "Wash carefully and iron at a low temperature";
        }
    };
    public String name;
    public String description;
    public Integer numShelf;

    Wardrobe(String name, String description, Integer numShelf) {
        this.name = name;
        this.description = description;
        this.numShelf = numShelf;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumShelf() {
        return numShelf;
    }

    public void setNumShelf(Integer numShelf) {
        this.numShelf = numShelf;
    }

    public abstract String showGarmentDescription();
}
