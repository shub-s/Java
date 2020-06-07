import java.text.SimpleDateFormat;
import java.util.*;

class datetime {
    public static void main(String[] args) {
        System.out.println("Date and Time"); 
        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime()));
    }    
}