import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadFile {

String fileName = "task01\\" ;
ArrayList <String> txtDetail = new ArrayList<String>();
HashMap<String , List<String>> csvMap = new HashMap<String , List<String>>();

    

public void readCSV(String csvFileName) throws IOException{
HashMap<String , List<String>> csvMap = new HashMap<String , List<String>>();
String line ;
String fullFileName = fileName + csvFileName ;
BufferedReader br = new BufferedReader(new FileReader(fullFileName));
        
while((line=br.readLine()) != null){
    String[] arrList ;
    ArrayList <String> csv = new ArrayList<String>();
    if(line.contains("first_name"))
    continue;
    arrList = line.split(",");

    for(String w:arrList){
        csv.add(w);
    }
    csvMap.put(csv.get(0), csv);
    this.csvMap=csvMap;
}
br.close();


}

public void readTXT(String txtFileName) throws IOException{
    String line ;
    String fullFileName = fileName + txtFileName ;
    BufferedReader br = new BufferedReader(new FileReader(fullFileName));
            
    while((line=br.readLine()) != null){
        
        this.txtDetail.add(line);
        // System.out.println(txtDetail);
    }
    br.close();

    // System.out.println(this.txtDetail);
    // for(Integer i = 0; i<=csvMap.size();i++){

    // }
    // System.out.println(csvMap);;
    
    }

    public void printDetails(){
        
    

    for(String w : csvMap.keySet()){
        for(String x : txtDetail){
            if(x.contains("<<address>>")){
                x = x.replace("<<address>>", csvMap.get(w).get(2));
                x.replace("\n", "--");
                String[] arrLine1 = x.split("--"); //                     HELPPPP

                for(String q : arrLine1){
                    q = q.trim();
                    System.out.println(q);
                }

            }
            if(x.contains("<<first_name>>")){
                x = x.replace("<<first_name>>", csvMap.get(w).get(0));
                System.out.println(x);
            }
            if(x.contains("<<years>>")){
                x = x.replace("<<years>>", csvMap.get(w).get(3));
                System.out.println(x);
            }
            if(x.contains("<<last_name>>")){
                x = x.replace("<<last_name>>", csvMap.get(w).get(1));
                System.out.println(x);
            }
            if(x.isEmpty()){
                System.out.println("\n");
            }


            
        }
        System.out.println("===================================================");
    }
    }

}
