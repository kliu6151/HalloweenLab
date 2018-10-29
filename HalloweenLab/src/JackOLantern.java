public class JackOLantern extends java.lang.Object{
    String[][] faceFeatures;

    public JackOLantern(java.lang.String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    public void edit(java.lang.String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }
    public void fill(java.lang.String str) {
        for (int i = 0; i < faceFeatures.length; i++) {
            for (int j = 0; j < faceFeatures[i].length; j++) {
                edit(str, i, j);
            }
        }
    }
    public java.lang.String toString()
    {
        String face = "";
        for(int i = 0;i<faceFeatures.length;i++)
        {
            for (int x = 0; x < faceFeatures.length; x++)
            {
                face += faceFeatures[i][x];
            }
            face += "\n";
        }
        return face;
    }

}
