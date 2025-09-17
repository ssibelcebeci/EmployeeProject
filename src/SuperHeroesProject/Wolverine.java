package SuperHeroesProject;

public class Wolverine extends SuperHeroes {

    private String adamantiumClaws;

    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty, String adamantiumClaws) {
        super(name, gender, aggression, wisdom, beauty);

        this.adamantiumClaws = adamantiumClaws;
    }

    public String getAdamtiumClaws() {
        return adamantiumClaws;
    }

    @Override
    public void attack() {
        //TODO: SuperHero sınıfının atack() metodunu uygulayın >> super.attack() gibi...
        // Örümcek adamın ismiyle beraber extra attack özelliğini konsola yazdırın...
        //"Ayrıca, " + getName() + "örümcek ağı püskürtme yeteneği ile saldırabilir ve düşmanlarını etkisiz hale getirebilir."
        super.attack();
        System.out.println("Ayrıca" + getName() + " adamantium pençeleri ile saldırabilir ve düşmanlarını hızla etkisiz hale getirebilir.");
    }

    @Override
    public void exposeSecretPower() {
        //TODO: Bu metod çağrıldığında, örümcek adama has özelliği sadece konsola yazdırın.
        // getName() + ", örümcek ağı püskürtme yeteneğine sahiptir."
        System.out.println(getName() + " adamantium pençelerine sahiptir ve bu pençeleriyle her türlü maddeyi kesip parçalayabilir.");
    }

    @Override
    public void printInfo() {
        super.printInfo();

        exposeSecretPower();

        System.out.println("**************************************************");
    }
}
