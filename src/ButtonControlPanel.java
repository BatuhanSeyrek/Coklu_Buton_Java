import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonControlPanel extends JFrame {

    private JButton[][] butonlar;//butonlar değerini tanımladık  çok boyutlu dizi olarak
    private Color renkaktif = Color.GREEN; //activeColor değişkenini renk olarak tanımlayıp yeşil değerini verdik.
    private Color renkinaktif = Color.BLUE;//inactiveColor  değişkenini renk olarak tanımlayıp mavi değerini verdik.
    private Icon ikonaktif = new ImageIcon("path/to/active_icon.png");//activeIcon değişkenini icon  olarak tanımladik.
    private Icon ikoninaktif = new ImageIcon("path/to/inactive_icon.png");//inactiveIcon değişkenini icon  olarak tanımladik.

    public ButtonControlPanel() {//Panelle ilgili özellikleri burada tanımladık

        super("<<<<<<Buton Kontrol Paneli>>>>>>");//Süper etiketini kullanarak panel adına değer verdik
        setLayout(new GridLayout(4, 4, 15, 15)); // burada sutunun ve satırın kaç bloktan oluşacağı aynı zamanda bloklar arasındaki boşluk  belirlenir.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kodu, bir JFrame'in kapatılma davranışını belirler. Bu satır, JFrame kapatıldığında uygulamanın sonlanmasını sağlar.


        butonlar = new JButton[4][4];//4*4'lük çok boyut dizi yapısıyla bir buton yapısı oluşturuluyor

        for (int i = 0; i < 4; i++) {//for döngüsü kulanılarak butonların içerisine yazılar yazılıyor
            for (int j = 0; j < 4; j++) {
                butonlar[i][j] = buton_oluşturma("Button " + (i * 4 + j + 1));//çok boyutlu dizinin içersine buton değeri tanımlanıyor.
                add(butonlar[i][j]);
            }
        }

        // Pencere özellikleri ayarlanıyor
        setSize(500, 400);//bu yapı sayesindede pencerenin genişliğini 500 , yüksekliğini ise 400 tanımladık.
        setLocationRelativeTo(null);//pencerenin ekranın ortasına yerleştirilmesini sağlar.
        setVisible(true);//kullanıcı tarafından görülebilir hale gelmesini sağlar.
    }

    private JButton buton_oluşturma(String buttonText) {
        JButton button = new JButton(buttonText);
        button.setBackground(renkinaktif);
        button.setIcon(ikoninaktif);

        // Butona tıklandığında çağrılacak olay
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(button);
            }
        });

        return button;
    }

    private void handleButtonClick(JButton butona_tiklama) {

        updateButtonState(butona_tiklama);// Tıklanan butonun durumu güncelleniyor


        String buttonText = butona_tiklama.getText();// Tıklanan butonun text değeri alınıyor


        runGraphQLMutation(buttonText);// Burada GraphQL mutation çalıştırma işlemlerini gerçekleştirebilirsiniz.
    }

    private void updateButtonState(JButton butona_tiklama) {

        for (int i = 0; i < 4; i++) {// Tüm butonlar pasif hale getiriliyor.
            for (int j = 0; j < 4; j++) {
                butonlar[i][j].setBackground(renkinaktif);//Arkaplan yeşil renk oluyor.
                butonlar[i][j].setIcon(ikoninaktif);
            }
        }


        butona_tiklama.setBackground(renkaktif);// Tıklanan buton aktif hale getiriliyor ve mavi renge dönüyor
        butona_tiklama.setIcon(ikonaktif);
    }

    private void runGraphQLMutation(String buttonText) {

        System.out.println("Running GraphQL mutation with button text: " + buttonText);//Kod kısımında tıklanılan butonun adı dönüuyor.
        // GraphQL işlemleri burada gerçekleştirilecek
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonControlPanel();//new'leyerek her başlangıçta sıfırlanarak başlamasını sağladık
            }
        });
    }
}
