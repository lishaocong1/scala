import java.io.File;

public class test {
    public static void main(String[] args) {
        File file1 = new File("E:\\KMS");
        String[] list = file1.list();
        for (String li:list){
            System.out.println(li);
        }
    }
    }
