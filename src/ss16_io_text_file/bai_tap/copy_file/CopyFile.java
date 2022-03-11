package ss16_io_text_file.bai_tap.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public List<String>  writeFile(List<String> str) {
        File file = new File("src/ss16_io_text_file/bai_tap/copy_file/file2.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(str));
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public List<String>readFile() {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File("src/ss16_io_text_file/bai_tap/copy_file/file1.txt"));
            if (!new File("src/ss16_io_text_file/bai_tap/copy_file/file1.txt").exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(new File("src/ss16_io_text_file/bai_tap/copy_file/file1.txt")));
            String line = "";
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return stringList ;
    }

    public static void main(String[] args) {
        CopyFile copyFileText = new CopyFile();
        List<String> stringList = copyFileText.readFile();
        copyFileText.writeFile(stringList);
    }
}
