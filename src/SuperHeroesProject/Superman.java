package SuperHeroesProject;


public class Superman extends SuperHeroes{

    private String superSonicFlight;

    public Superman(String name, String gender, String aggression, String wisdom, String beauty,String superSonicFlight) {
        super(name, gender, aggression, wisdom, beauty);
        this.superSonicFlight=superSonicFlight;
    }

    public String getSuperSonicFlight() {
        return superSonicFlight;
    }

    @Override
    public void attack() {
        //TODO: SuperHero sınıfının atack() metodunu uygulayın >> super.attack() gibi...
        // Örümcek adamın ismiyle beraber extra attack özelliğini konsola yazdırın...
        //"Ayrıca, " + getName() + "örümcek ağı püskürtme yeteneği ile saldırabilir ve düşmanlarını etkisiz hale getirebilir."
        super.attack();
        System.out.println("Ayrıca"+ getName()+ " uçarken super sonic flight güçlü saldırılar gerçekleştirebilir.");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println(getName() + " supersonic flight hızında uçma yeteneğine sahiptir..");

    }

    @Override
    public void printInfo() {
        super.printInfo();
        //TODO: Bu metod çağrıldığında, tüm kahramanların özelliği yazdırıldığı gibi, konsola örümcek adama has özelliği de yazdırın
        // (@Override sayesinde)...
        exposeSecretPower();
        System.out.println("**************************************************");

    }}

