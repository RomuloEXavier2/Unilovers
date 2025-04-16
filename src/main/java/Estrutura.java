import java.io.IOException;
import java.nio.file.*;

public class Estrutura {

    public static void main(String[] args) {
        String basePath = "logitrack/src/main/java/com/suaempresa/logitrack";

        String[] directories = {
                basePath + "/controller",
                basePath + "/model",
                basePath + "/repository",
                basePath + "/service",
                "logitrack/src/main/resources"
        };

        String[] files = {
                basePath + "/controller/RoboLogisticoController.java",
                basePath + "/model/RoboLogistico.java",
                basePath + "/repository/RoboLogisticoRepository.java",
                basePath + "/service/RoboLogisticoService.java",
                basePath + "/LogitrackApplication.java",
                "logitrack/src/main/resources/application.properties",
                "logitrack/pom.xml",
                "logitrack/README.md"
        };

        try {
            for (String dir : directories) {
                Files.createDirectories(Paths.get(dir));
            }

            for (String file : files) {
                Path path = Paths.get(file);
                if (!Files.exists(path)) {
                    Files.createFile(path);
                }
            }

            System.out.println("Estrutura criada com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro ao criar estrutura: " + e.getMessage());
        }
    }
}
