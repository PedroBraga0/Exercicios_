package Lista_de_Tarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();
        String tarefas;

        int i = 0;
        while (true) {
            System.out.println("TAREFA " + i + ": ");
            tarefas = scanner.nextLine();

            if ("x".equals(tarefas)) {
                break;
            }
            linhas.add(tarefas);
            i++;
        }
        escrevernoArquivo("C:\\Users\\aluno\\IdeaProjects\\Programação_orientada_a_objeto\\src\\Lista_de_Tarefas\\arquivo.txt", linhas);
        scanner.close();
        System.out.println("FIM...");
    }

    private static void escrevernoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
        Path path = Paths.get(arquivo);
        Files.write(path, linhas);
    }
}


