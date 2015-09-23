/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetess4j;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author Berg
 */
public class TesteTess4J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setProperty("jna.library.path", "32".equals(System.getProperty("sun.arch.data.model")) ? "lib/win32-x86" : "lib/win32-x86-64");
            Tesseract t = new Tesseract();
            t.setDatapath("C:\\Program Files\\Tesseract-OCR");
            File f = new File("image.png");
            System.out.println(t.doOCR(f));
        } catch (TesseractException ex) {
            Logger.getLogger(TesteTess4J.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
