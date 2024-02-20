import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String path) throws IOException {
        File file;
        try {
            file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args){
        System.out.println("Nhập đường dẫn file: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
       String path = "C:\\Users\\ASUS\\OneDrive\\Code Gym\\Codegym_Module2_Week4\\Read_file_example\\src\\Test.txt";
        ReadFileExample readfileEx = new ReadFileExample();
        try {
            readfileEx.readFileText(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
