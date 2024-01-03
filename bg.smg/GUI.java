import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GUI extends JFrame {
    private List<Product> books = new ArrayList<>();
    private JTextField titleField, ownerField;
    private JLabel imageLabel;
    private ImageIcon productImage;

    public GUI() {
        createUI();
    }

    private void createUI() {

        setTitle("Item Manager");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));


        add(new JLabel("Username:"));
        add(new JTextField(20));
        add(new JLabel("Password:"));
        add(new JPasswordField(20));
        add(new JButton("Login"));


        titleField = new JTextField(20);
        ownerField = new JTextField(20);
        JButton uploadButton = new JButton("Upload Image of Item");
        JButton saveButton = new JButton("Save Item");
        imageLabel = new JLabel();

        add(new JLabel("Title:"));
        add(titleField);
        add(new JLabel("Description:"));
        add(ownerField);
        add(uploadButton);
        add(imageLabel);
        add(saveButton);


        uploadButton.addActionListener(e -> uploadImage());

        saveButton.addActionListener(e -> saveProduct());
    }

    private void uploadImage() {

    }

    private void saveProduct() {
        Product product = new Product(titleField.getText(), ownerField.getText(), productImage);
        JOptionPane.showMessageDialog(this, "Item Saved!");
    }
}

