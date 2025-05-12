import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CharacterCard extends JPanel {
    public CharacterCard(Character character) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        try {
            String path = character.getImagePath();
            Image image;

            if (path.startsWith("http")) {
                // Ambil gambar dari URL
                URL url = new URL(path);
                image = ImageIO.read(url);
            } else {
                // Ambil gambar dari path lokal
                image = new ImageIcon(path).getImage();
            }

            // Resize gambar
            Image scaled = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaled));

        } catch (IOException e) {
            imageLabel.setText("Gambar gagal dimuat");
        }

        JLabel nameLabel = new JLabel(character.getName(), SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));

        add(imageLabel, BorderLayout.CENTER);
        add(nameLabel, BorderLayout.SOUTH);
    }
}
