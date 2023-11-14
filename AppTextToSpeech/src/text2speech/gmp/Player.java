package text2speech.gmp;

import java.io.IOException;

final class Player
{
    public void winPlay(final String tempPath) {
        try {
            final ProcessBuilder pb = new ProcessBuilder(new String[] { "cmd", "/c", "start", "/min", "/b", tempPath });
            pb.start();
        }
        catch (IOException e) {
            System.out.println("Narrator Can't Be Played: " + e);
        }
    }
    
    public void linPlay(final String tempPath) {
    }
    
    public void macPlay(final String tempPath) {
    }
}
