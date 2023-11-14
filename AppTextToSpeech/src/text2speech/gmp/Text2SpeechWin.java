package text2speech.gmp;

import java.nio.file.Files;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

final class Text2SpeechWin
{
    public void winT2S(final String text) {
        try {
            final String scriptFolder = System.getenv("temp");
            final File vbsFile = new File(scriptFolder, "t2s.vbs");
            final File batFile = new File(scriptFolder, "text_to_speech.bat");
            final FileWriter writer = new FileWriter(batFile);
            writer.write("@echo off\n");
            writer.write("setlocal enabledelayedexpansion\n");
            writer.write("set textToSpeak=\"" + text + "\"\n");
            writer.write("echo Set objVoice = CreateObject(\"SAPI.SpVoice\") > " + vbsFile.getAbsolutePath() + "\n");
            writer.write("echo objVoice.Speak !textToSpeak!, 0 >> " + vbsFile.getAbsolutePath() + "\n");
            writer.write("cscript //NoLogo " + vbsFile.getAbsolutePath() + "\n");
            writer.write("del " + vbsFile.getAbsolutePath() + "\n");
            writer.write("endlocal\n");
            writer.write("exit\n");
            writer.close();
            final Player play = new Player();
            play.winPlay(batFile.getAbsolutePath());
            batFile.deleteOnExit();
        }
        catch (IOException e) {
            System.out.println("Text To Speech Can't Be Created: " + e);
        }
    }
    
    public void winT2S(final File file) {
        try {
            final String scriptFolder = System.getenv("temp");
            final File vbsFile = new File(scriptFolder, "t2s.vbs");
            final File batFile = new File(scriptFolder, "text_to_speech.bat");
            final String text = new String(Files.readAllBytes(file.toPath()));
            final FileWriter writer = new FileWriter(batFile);
            writer.write("@echo off\n");
            writer.write("setlocal enabledelayedexpansion\n");
            writer.write("set textToSpeak=\"" + text + "\"\n");
            writer.write("echo Set objVoice = CreateObject(\"SAPI.SpVoice\") > " + vbsFile.getAbsolutePath() + "\n");
            writer.write("echo objVoice.Speak !textToSpeak!, 0 >> " + vbsFile.getAbsolutePath() + "\n");
            writer.write("cscript //NoLogo " + vbsFile.getAbsolutePath() + "\n");
            writer.write("del " + vbsFile.getAbsolutePath() + "\n");
            writer.write("endlocal\n");
            writer.write("exit\n");
            writer.close();
            final Player play = new Player();
            play.winPlay(batFile.getAbsolutePath());
            batFile.deleteOnExit();
        }
        catch (IOException e) {
            System.out.println("Text To Speech Can't Be Created: " + e);
        }
    }
}
