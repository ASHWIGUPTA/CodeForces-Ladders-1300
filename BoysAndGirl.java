import java.io.*;
import java.util.*;
 
public class BoysAndGirl { 
    public static void main(String[] args) throws IOException { 
        try (BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")))) {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("output.txt"))));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken()), g = Integer.parseInt(st.nextToken());
            int max = Math.max(b, g);
            int min = Math.min(b, g);
            for (int i = 0; i < min; i++) {
                if (min == g) {
                    out.print("BG");
                }
                else
                    out.print("GB");
            }
            b -= min;
            g -= min;
            if (g == 0)
                for (int i = 0; i < b; i++)
                    out.print("B");
            else
                for (int i = 0; i < g; i++)
                    out.print("G");
            out.println();
            out.flush();
            out.close();
        }
    }
}