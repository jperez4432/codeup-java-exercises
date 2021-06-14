import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//
//    Path path = Paths.get("src", "FileIOLecture.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//
//        Path pathToSource = Paths.get("src");
//        Path thisWillWork = Paths.get(String.valueOf(pathToSource), "FileIOLecture.java");
//        System.out.println(thisWillWork);
//

        Path toOurDataPlace = Paths.get("src/data");
        //   System.out.println(toOurDataPlace);
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");
//        Path path = Paths.get("src", "bro.jpeg");
//        System.out.println(path.toAbsolutePath());
//
//        try {
//            if (Files.notExists(toOurDataPlace)) {
//                Files.createDirectories(toOurDataPlace);
//            } else {
//                System.out.println("The " + toOurDataPlace + " directory already exists.");
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//        try {
//            if (Files.notExists(toOurDataFile)) {
//                Files.createFile(toOurDataFile);
//            }
//            Files.createFile(toOurDataPlace);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Massaline", "Julia Domna");

        try {
            Files.write(toOurDataFile, romanEmpresses);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        List<String> currentList = new ArrayList<>();

        try {
            currentList = Files.readAllLines(toOurDataFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (String line : currentList) {
            System.out.println(line);
        }
    }
}
//        try {
//            List<String> lines = Files.readAllLines(Paths.get("data", "data.txt"));
//            List<String> newlist = new ArrayList<>();
//
//            for (String line : lines) {
//                if (lines.equals("Livia")) {
//                    newlist.add("Penelope");
//                    continue;
//                }
//                newlist.add(line);
//            }
//        }
//        Files.write(Paths.get("data", "data.txt"), newlist);
//    }
//}
