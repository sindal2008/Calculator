package epam.sindalouski.calculator.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * В классе читается полученый файл
 */
public class FileReader {

    public static ArrayList<String> getParamsFromFile(String fileName) {

        /** список который будет содержать все параметры для вычислений полученые из файла*/
        ArrayList<String> list = new ArrayList<>();

        /** BufferedReader для чтения текстового файла */
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new java.io.FileReader(fileName));
            while (reader.ready()){

                String line = reader.readLine();

                if (!line.equals("")) {
                    list.add(line);
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден, ошибка: " + e);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                }catch (IOException ioException){
                    System.out.println("Ошибка: " + ioException);
                }
            }
        }
        return list;
    }
}
