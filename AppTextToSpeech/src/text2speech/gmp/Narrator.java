package text2speech.gmp;

import java.io.File;

public class Narrator
{
    public Narrator() {
        System.out.println("\r\nText2Speech Library, Version 1.0\r\n==============================================\r\nCreated By Gabriel Mora\r\nSystems Engineer And Creator of Project TextToSpeech In Java\r\n");
    }
    
    public void winTextRead(final String text) {
        final Text2SpeechWin t2s = new Text2SpeechWin();
        t2s.winT2S(text);
    }
    
    public void winFileRead(final File file) {
        final Text2SpeechWin t2s = new Text2SpeechWin();
        t2s.winT2S(file);
    }
    
    public void linTextRead(final String text) {
    }
    
    public void linFileRead(final File file) {
    }
    
    public void macTextRead(final String text) {
    }
    
    public void macFileRead(final File file) {
    }
}
