import java.util.Arrays;

public class Nut{
    public static void main(String[] args) throws InterruptedException {
        float A = 0, B = 0;
        float i, j;
        int k;
        float[] z = new float[1760];
        char[] b = new char[1760];
        Arrays.fill(b, ' ');
        Arrays.fill(z, 0);

        for (; ; ) {
            Arrays.fill(b, ' ');
            Arrays.fill(z, 0);
            for (j = 0; j < 6.28; j += 0.07) {
                for (i = 0; i < 6.28; i += 0.02) {
                    float c = (float) Math.sin(i);
                    float d = (float) Math.cos(j);
                    float e = (float) Math.sin(A);
                    float f = (float) Math.sin(j);
                    float g = (float) Math.cos(A);
                    float h = d + 2;
                    float D = 1 / (c * h * e + f * g + 5);
                    float l = (float) Math.cos(i);
                    float m = (float) Math.cos(B);
                    float n = (float) Math.sin(B);
                    float t = c * h * g - f * e;
                    int x = (int) (40 + 30 * D * (l * h * m - t * n));
                    int y = (int) (12 + 15 * D * (l * h * n + t * m));
                    int o = x + 80 * y;
                    int N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                    if (22 > y && y > 0 && x > 0 && 80 > x && D > z[o]) {
                        z[o] = D;
                        b[o] = ".,-~:;=!*#$@".charAt(N > 0 ? N : 0);
                    }
                }
            }

            System.out.print("\033[H\033[2J");
            for (k = 0; k < 1761; k++) {
                System.out.print(k % 80 != 0 ? b[k] : '\n');
                A += 0.00004;
                B += 0.00002;
            }
            Thread.sleep(30);
        }
    }
}
