import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        // Criar um médico
        Medico medico = new Medico(1, "Dr. João", "Cardiologia");

        Paciente paciente = new Paciente(1, "Maria ", "123");

        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 0, 0);
        double valor = 150.0;
        Consulta consulta = new Consulta(dataConsulta, valor, medico, paciente);

        System.out.println(consulta);
    }
}
