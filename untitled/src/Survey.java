public class Survey {
    public static void main(String[] args) {

        System.out.println("Questions: " + "How would you rate your overall experience with our customer service?");
        Responses();
        results();
    }

    public static void Responses() {System.out.println("Responses: " +
            "Very satisfied\n" +
            "Satisfied\n" +
            "Neutral\n" +
            "Dissatisfied\n" +
            "Very dissatisfied");}
    public static void results() {System.out.println("Results: " +
            "Very satisfied: 45%\n" +
            "Satisfied: 35%\n" +
            "Neutral: 10%\n" +
            "Dissatisfied: 8%\n" +
            "Very dissatisfied: 2%");}
}
