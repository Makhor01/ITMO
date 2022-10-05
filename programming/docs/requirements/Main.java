public class Main {
    public static void schet(float c){

        System.out.printf("%10.3f", c);
        System.out.print(" ");
    }
    public static float rand(){
        return (float) (-5.0 + (float) (Math.random() * 6.0));
    }
    public static void main(String[] args) {
        int[] d = new int[10];
        float[] x = new  float[14];
        float[][] c = new float[10][14];
        for (int i = 0; i < 10; i++) {
            d[i] = 5 + i*2;
            for (int j = 0; j < 14; j++) {
                x[j] = rand();
                if (d[i] == 5) {
                    c[i][j] = (float) Math.pow(Math.pow((4+Math.pow(x[j]+1,2))/0.5,3),4*Math.asin((x[j]+0.5)/11));
                } else if (d[i] == 7 || d[i] == 11 || d[i] == 15 || d[i] == 19 || d[i] == 23) {
                    c[i][j] = (float) Math.cbrt(Math.log(Math.pow(Math.sin(x[j]),2)));
                } else {
                    c[i][j] = (float) Math.pow((0.5/(0.5-Math.sin(Math.pow(((1 - Math.tan(x[j]) )/2),2) ) ) ),3);
                }
                schet(c[i][j]);

            }
            System.out.println();
        }
    }
}