import java.sql.SQLOutput;

public class TriangleClassifier {
    String checkTriangle(int a, int b, int c){
        if(a<=0||b<=0||c<=0){
            return "không phải là tam giác";
        }
        else{
            if(a==b&&a==c){
                return "tam giác đều";
            }
            else if(a==b||b==c||a==c){
                return "tam giác cân";
            }
            else {
                return "tam giác thường";
            }
        }
    }
}
