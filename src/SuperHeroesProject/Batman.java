package SuperHeroesProject;

public class Batman extends SuperHeroes{

        //TODO: Sadece SpiderMan'e has String tipinde bir özellik (field) tanımlayın

        private String detectiveSkills;

    public Batman(String name, String gender, String aggression, String wisdom, String beauty, String detectiveSkills) {
        super(name, gender, aggression, wisdom, beauty);
        this.detectiveSkills = detectiveSkills;
    }
    public String getDetectiveSkills() {
            return detectiveSkills;
        }

        @Override
        public void attack() {
            //TODO: SuperHero sınıfının atack() metodunu uygulayın >> super.attack() gibi...
            // Örümcek adamın ismiyle beraber extra attack özelliğini konsola yazdırın...
            super.attack();
            System.out.println("Ayrıca "+getName()+ " dedektif becerileri ile saldırabilir ve düşmanlarını planlayarak alt edebilir.");
        }

        @Override
        public void exposeSecretPower() {
            //TODO: Bu metod çağrıldığında, örümcek adama has özelliği sadece konsola yazdırın.
            // getName() + ", örümcek ağı püskürtme yeteneğine sahiptir."
            System.out.println(getName() + " dedektif becerilerine sahiptir ve bu yeteneğiyle suçluları yakalamada ustalaşmıştır.");
        }

        @Override
        public void printInfo() {
            super.printInfo();

            exposeSecretPower();

            System.out.println("**************************************************");

        }
    }
