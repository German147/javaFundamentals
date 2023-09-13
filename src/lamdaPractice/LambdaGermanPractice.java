package lamdaPractice;

public class LambdaGermanPractice {
    public static void main(String[] args) {

        GreetingService helloAgent = (name)-> System.out.println("Hello "+name);
        helloAgent.greeting("German");

        System.out.println("Returning Value ...");
        RetuningLambdaFunction yourName = name -> name.toUpperCase();
        System.out.println(yourName.whatIsYourName("German"));

        System.out.println("Boolean Result");

        LambdaBoolean isFemale = mapger -> mapger.equalsIgnoreCase("Female");
        System.out.println(isFemale.areYouAFemale("Female"));

    }

}
