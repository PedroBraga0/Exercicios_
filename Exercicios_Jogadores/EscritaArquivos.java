package Exercicios_Jogadores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<>();

        System.out.println("\n-------------------CADASTRO DE JOGADORES-----------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("JOGADOR " + i + " : ");
            String nome = scanner.nextLine();
            linhas.add(nome);

        }
        Path arquivo = Paths.get("C:\\Users\\aluno\\IdeaProjects\\Programação_orientada_a_objeto\\src\\Exercicios_Jogadores\\arquivo.txt");
        Files.write(arquivo, linhas);

        System.out.println("---------------------------------------------");


        FileReader DadosDosJogadores = new FileReader("C:\\Users\\aluno\\IdeaProjects\\Programação_orientada_a_objeto\\src\\Exercicios_Jogadores\\arquivo.txt");
        BufferedReader informacao = new BufferedReader(DadosDosJogadores);

    }
}

