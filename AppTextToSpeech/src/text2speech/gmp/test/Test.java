package text2speech.gmp.test;

import java.io.File;

import javax.swing.JFileChooser;

import text2speech.gmp.Narrator;

public class Test
{
    public static void main(final String[] args) {
        final Narrator narrator = new Narrator();
        narrator.winTextRead("Hola Amores");
        final JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("SELECT A TXT FILE");
        final int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == 0) {
            final File selectedFile = fileChooser.getSelectedFile();
            narrator.winFileRead(selectedFile);
        }
    }
}
