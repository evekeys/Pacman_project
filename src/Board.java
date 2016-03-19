/**
 * Created by Toshiba on 3/18/2016.
 */

public class Board {
    private int dirdx; // direction on x ( -1, 0 or 1)
    private int dirdy; // direction on y ( -1, 0 or 1)
    private int viewdx;
    private int viewdy;
    private int nbofghosts = 6;

    private Ghost ghosts[];
    public int getDirdx() {
        return dirdx;
    }

    public void setDirdx(int dirdx) {
        this.dirdx = dirdx;
    }

    public int getDirdy() {
        return dirdy;
    }

    public void setDirdy(int dirdy)
    {
        this.dirdy=dirdy;
    }


    private void continueLevel()
    {
        short i;
        int dx =1;
        int random;

        for(i =0; i< nbofghosts; i++) {

        }
    }


}
