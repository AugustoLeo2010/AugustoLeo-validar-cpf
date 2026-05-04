import javax.swing.*;

    public class TelaCPF {
        public static void main(String[] args) {

            JFrame frame = new JFrame("Validador de CPF");
            frame.setSize(300, 150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JTextField campoCPF = new JTextField();
            campoCPF.setBounds(50, 20, 200, 25);

            JButton botao = new JButton("Validar");
            botao.setBounds(90, 50, 120, 25);

            JLabel resultado = new JLabel("");
            resultado.setBounds(90, 80, 150, 25);

            botao.addActionListener(e -> {
                String cpf = campoCPF.getText();

                if (ValidadorCPF.validarCPF(cpf)) {
                    resultado.setText("CPF válido");
                } else {
                    resultado.setText("CPF inválido");
                }
            });

            frame.add(campoCPF);
            frame.add(botao);
            frame.add(resultado);

            frame.setVisible(true);
        }
    }
