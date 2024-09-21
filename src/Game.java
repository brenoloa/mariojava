import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Game {

    Timer timer;
    JLabel imagem;
    public Game() {
        JFrame tela = new JFrame("xx");
        tela.setSize(1200, 700);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        
        String[] img = new String[12];
        for (int i = 0; i < img.length; i++) {
            img[i] = String.format("C:\\Users\\Pichau\\VSCODE\\mariojframe\\img\\image (%d).png", i + 1 );
        }

        imagem = new JLabel(new ImageIcon(img[0]));
        imagem.setBounds(0, 400, 257, 257); 
        tela.add(imagem);
        
        timer = new Timer(100, new ActionListener() {
            int yyy = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                yyy = (yyy + 1) % img.length;
                imagem.setIcon(new ImageIcon(img[yyy]));
                imagem.setBounds(0, 400, 257, 257);
            }
        });
        timer.start();
        
        tela.setVisible(true);
    }
}
