import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class CharacterListApp extends JFrame {
    public CharacterListApp() {
        setTitle("Character List");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top Navbar
        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBackground(Color.DARK_GRAY);
        topBar.setPreferredSize(new Dimension(0, 50));

        JLabel title = new JLabel("Honkai: Star Rail Characters List");
        title.setForeground(Color.WHITE);
        title.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        title.setFont(new Font("SansSerif", Font.BOLD, 16));

        JPanel rightButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rightButtons.setOpaque(false);

        JButton discordBtn = createStyledButton("Join Discord", new Color(66, 135, 245));
        JButton kofiBtn = createStyledButton("Buy us a Ko-Fi", new Color(255, 100, 100));

        rightButtons.add(discordBtn);
        rightButtons.add(kofiBtn);

        topBar.add(title, BorderLayout.WEST);
        topBar.add(rightButtons, BorderLayout.EAST);
        add(topBar, BorderLayout.NORTH);

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(Color.DARK_GRAY);
        sidebar.setPreferredSize(new Dimension(150, 0));

        String[] menuItems = {
            "Home", "Characters", "Tier List", "Memory of Chaos",
            "Light Cones", "Relics", "Guides", "Tools"
        };

        for (String item : menuItems) {
            JButton btn = createStyledButton(item, new Color(50, 50, 50));
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            sidebar.add(btn);
        }

        add(sidebar, BorderLayout.WEST);

        // Character Grid
        JPanel characterPanel = new JPanel();
        characterPanel.setLayout(new GridLayout(0, 4, 10, 10));
        characterPanel.setBackground(Color.WHITE);
        characterPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ArrayList<Character> characters = loadCharacters();
        for (Character c : characters) {
            characterPanel.add(new CharacterCard(c));
        }

        JScrollPane scrollPane = new JScrollPane(characterPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private JButton createStyledButton(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setBackground(bg);
        btn.setForeground(Color.WHITE);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setMaximumSize(new Dimension(150, 40));
        return btn;
    }

    private ArrayList<Character> loadCharacters() {
    ArrayList<Character> list = new ArrayList<>();

    list.add(new Character("Boruto", "https://static.wikia.nocookie.net/naruto/images/7/70/Boruto_Boruto_Movie.png/revision/latest?cb=20150526164416&path-prefix=id"));
    list.add(new Character("Naruto", "https://dorangadget.com/wp-content/uploads/2023/09/Naruto-Uzumaki-.jpg"));
    list.add(new Character("Sarada", "https://www.harapanrakyat.com/wp-content/uploads/2023/09/Sarada-Uchiha-di-Anime-Boruto.jpeg"));
    list.add(new Character("Sasuke", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-JaLzQYmxXnc6xMKKXQzBH8yOs-4OVmblqA&s"));
    list.add(new Character("Mitsuki", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjdY3P4jqeSWu0KYn-gS1ym0eyj2IX4F4R5A&s"));
    list.add(new Character("Orachimaru", "https://static.wikia.nocookie.net/naruto/images/e/e8/Orochimaru2.jpg/revision/latest?cb=20140701144308&path-prefix=id"));
    list.add(new Character("Kakashi", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr4plI7h-TkQR-hvzkaY67EuOxewt2L4Wfxw&s"));
    list.add(new Character("Jiraiya", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9wgb3QOloU4KRk9va0QYLHljwTRgqi7gN6A&s"));
    list.add(new Character("Guy", "https://static.wikia.nocookie.net/naruto/images/4/40/MightGuy.png/revision/latest?cb=20140628145711&path-prefix=id"));
    list.add(new Character("Shikamaru", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQngww9Y5AOIN0atbLaWVNZZuo3qv2tYa12wg&s"));
    list.add(new Character("Obito", "https://static.wikia.nocookie.net/naruto/images/4/4a/Obito_Uchiha.png/revision/latest/scale-to-width-down/1200?cb=20170604211333&path-prefix=id"));
    list.add(new Character("Madara", "https://thumb.viva.id/vivabanyuwangi/1265x711/2024/09/25/66f3bbb07ffd6-anime-naruto-madara-uchiha_banyuwangi.jpg"));
    list.add(new Character("Itachi", "https://api.duniagames.co.id/api/content/upload/file/5040920901711596131.jpg"));
    list.add(new Character("Shisui", "https://static.wikia.nocookie.net/naruto/images/2/27/Kotoamatsukami123.png/revision/latest?cb=20140725084150&path-prefix=id"));
    list.add(new Character("Minato", "https://static.wikia.nocookie.net/naruto/images/7/71/Minato_Namikaze.png/revision/latest?cb=20160626133835&path-prefix=id"));
    list.add(new Character("Kaguya", "https://static.wikia.nocookie.net/naruto/images/6/6c/Kaguya_%C5%8Ctsutsuki.png/revision/latest?cb=20160617000338&path-prefix=id"));
    list.add(new Character("Neji", "https://static.wikia.nocookie.net/naruto/images/8/8e/Neji_Part_I_Screenshot.png/revision/latest?cb=20151209122141&path-prefix=id"));
    list.add(new Character("Hashirama", "https://static.wikia.nocookie.net/naruto/images/2/20/Hashirama%27s_Sage_Mode.png/revision/latest?cb=20150131123449&path-prefix=id"));
    list.add(new Character("Choji", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTINv63xEreDD8saNom4_HkhtWmO0JFzJJmXA&s"));
    list.add(new Character("Kiba", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpui_kQ_LxTwgEk4sodOLoq9WKekAuozmCgg&s"));
    
    return list;
}


    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CharacterListApp::new);
    }
}
