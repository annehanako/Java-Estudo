package odontoConsultorio;

import java.util.Scanner;

public class Dentista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) à Odonto Sense Plus!");
        System.out.print("Por favor, informe o seu nome: ");
        String nomePaciente = scanner.nextLine();

        System.out.println("Olá, " + nomePaciente + "! Eu sou a Lais e será um prazer te atender.");

        System.out.print("Você está sentindo alguma dor de dente? (Sim/Não): ");
        String respostaDorDente = scanner.nextLine();

        System.out.print("Você já veio ao dentista nos últimos 6 meses? (Sim/Não): ");
        String respostaLimpeza = scanner.nextLine();

        boolean necessidadeTratamento = respostaDorDente.equalsIgnoreCase("Sim")
                || respostaLimpeza.equalsIgnoreCase("Não");

        if (necessidadeTratamento) {
            System.out
                    .println("Com base nas suas respostas, recomendamos que você agende uma consulta para avaliação.");
            System.out.println("Por favor, escolha um dos seguintes horários para seu atendimento:");
            System.out.println("1 - 10h (Segunda-Feira, consultório 2 com a Dra. Tamara)");
            System.out.println("2 - 13h (Quarta-Feira, consultório 3 com o Dr. Gustavo)");
            System.out.println("3 - 15:30h (Segunda-Feira, consultório 1 com a Dra. Elisabeth)");

            String respostaHorario = scanner.nextLine();
            String mensagemAgendamento = "";

            if (respostaHorario.equals("1")) {
                mensagemAgendamento = "As 10 horas da manhã, Segunda-Feira no consultório 2 com a Dra. Tamara.";
            } else if (respostaHorario.equals("2")) {
                mensagemAgendamento = "As 13 horas, Quarta-Feira no consultório 3 com o Dr. Gustavo.";
            } else if (respostaHorario.equals("3")) {
                mensagemAgendamento = "As 15:30 no consultório 1 com a Dra. Elisabeth.";
            } else {
                mensagemAgendamento = "Opção inválida.";
            }

            System.out.println(mensagemAgendamento);

            if (!mensagemAgendamento.equals("Opção inválida")) {
                System.out.print("Podemos confirmar o agendamento? (Sim/Não): ");
                String respostaConfirmar = scanner.nextLine();

                if (respostaConfirmar.equalsIgnoreCase("Sim")) {
                    System.out.println("Agendado. Agradecemos a preferência. Desejamos uma excelente consulta!");
                } else {
                    System.out.println(
                            "Agendamento não confirmado. Caso deseje agendar, entre em contato conosco novamente.");
                }
            }
        } else {
            System.out.println(
                    "Com base nas suas respostas, parece que você está com a saúde bucal em dia! Continue com os cuidados e faça visitas regulares ao dentista.");
        }

        System.out.println("Voltar [E]");

        if (scanner.nextLine().equals("E")) {
            scanner.close();
        }
    }
}