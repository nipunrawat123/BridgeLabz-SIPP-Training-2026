import java.io.*;
import java.util.*;
public class SchoolResultPortal {
    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (

                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(outputFile, true))
        ) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / (data.length - 1);

                bw.write("=================================\n");
                bw.write("Student Name : " + name + "\n");
                bw.write("Average Marks: " + String.format("%.2f", average) + "\n");
                bw.write("Grade        : " + getGrade(average) + "\n");
                bw.write("=================================\n\n");
            }

            System.out.println("Report cards generated successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Student data file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading/writing file.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid marks found in file.");
        }
    }

    public static String getGrade(double avg) {
        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else
            return "F";
    }
}