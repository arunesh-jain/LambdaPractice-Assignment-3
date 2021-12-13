public class ConcateTask {
    public static void main(String[] args) {

        ConcateTaskInterface lambda=(one, two, three, four, five, sis, seven)->{

            StringBuilder result=new StringBuilder("");

            result.append(one.toUpperCase());
            result.append(two.toUpperCase());
            result.append(three.toUpperCase());
            result.append(four.toUpperCase());
            result.append(five.toUpperCase());
            result.append(sis.toUpperCase());
            result.append(seven.toUpperCase());

            return new String(result);
        };

        System.out.println(lambda.concateString("The", "lambda", "has", "too", "many", "string" ,"arguments."));
    }
}
