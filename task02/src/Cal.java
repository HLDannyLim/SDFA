import java.util.Scanner;

public class Cal {
    Float number1 ;
    Float number2 ;
    Float total  ;
    
public void cal(){
    String line ;

    String[] arrLine;

    System.out.println("Welcome.");

    Scanner sc = new Scanner(System.in);

    while(true){
        line = sc.nextLine();
        if(line.contains("exit")){
            System.out.println("Bye bye");
            break;
        }
        arrLine = line.split(" ");
        if (arrLine[0].matches("[0-9]+") && arrLine[0].length() > 2){
            this.number1 = Float.parseFloat(arrLine[0]);
        }
        else if (arrLine[0].equals("$last")){
            if (total != null)
            this.number1 = total ;
            else{
                System.out.println("You cannot use $last on the first line");
                System.out.println("Bye bye");
                break;
            }


            
        }

        this.number2 = Float.parseFloat(arrLine[2]);
        this.total = this.number1 + this.number2 ;


        if(line.contains("+")){
            total = number1 + number2;
            System.out.println(total);
        }
        else if(line.contains("-")){
            total = number1 - number2;
            System.out.println(total);
        }
        else if(line.contains("/")){
            total = number1 / number2;
            System.out.println(total);
        }
        else if(line.contains("*")){
            total = number1 * number2;
            System.out.println(total);
        }
        else{
            System.out.println("incorrect input");
        }
        
        
    }
}

}
