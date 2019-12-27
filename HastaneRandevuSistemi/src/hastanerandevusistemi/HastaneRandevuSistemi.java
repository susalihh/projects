
package hastanerandevusistemi;

import javax.swing.JFrame;

public class HastaneRandevuSistemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GirisEkrani ge = new GirisEkrani();
        ge.setVisible(true);
        ge.pack();
        ge.setLocationRelativeTo(null);
        ge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
