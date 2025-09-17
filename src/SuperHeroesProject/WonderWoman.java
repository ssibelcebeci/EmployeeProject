package SuperHeroesProject;


public class WonderWoman extends SuperHeroes {

    private String goldenLasso;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String goldenLasso) {
        super(name, gender, aggression, wisdom, beauty);

        this.goldenLasso = goldenLasso;
    }

    public String getGoldenLasso() {
        return goldenLasso;
    }

    @Override
    public void attack() {
        //TODO: SuperHero sınıfının atack() metodunu uygulayın >> super.attack() gibi...
        // Örümcek adamın ismiyle beraber extra attack özelliğini konsola yazdırın...
        //"Ayrıca, " + getName() + "örümcek ağı püskürtme yeteneği ile saldırabilir ve düşmanlarını etkisiz hale getirebilir."
        super.attack();
        System.out.println("Ayrıca" + getName() + " Golden Lasso Truth Lasso ile saldırabilir ve düşmanlarını doğruyu söylemeye zorlayabilir.");
    }

    @Override
    public void exposeSecretPower() {
        //TODO: Bu metod çağrıldığında, örümcek adama has özelliği sadece konsola yazdırın.
        // getName() + ", örümcek ağı püskürtme yeteneğine sahiptir."
        System.out.println(getName() + " doğruluğu söylemeye yarayan Truth Lasso yeteneğine sahiptir.");
    }

    @Override
    public void printInfo() {
        super.printInfo();

        exposeSecretPower();

        System.out.println("**************************************************");

// TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...
    }
}

